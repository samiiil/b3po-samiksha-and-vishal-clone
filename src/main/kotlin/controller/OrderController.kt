package controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import models.CreateOrderInput
import models.DataStorage
import services.Validations
import validations.UserValidations

@Controller("/user")
class OrderController {
    @Post("/{userName}/createOrder")
    fun createOrder(userName: String, @Body body: CreateOrderInput): HttpResponse<*> {
        val errorMessages: ArrayList<String> = ArrayList()

        var response: Map<String, *>?

        response=UserValidations.validateUser(userName)
        if(response!=null)
            return HttpResponse.status<Any>(HttpStatus.UNAUTHORIZED).body(response)


        if (body.orderType.isNullOrBlank())
            errorMessages.add("orderType is missing, orderType should be BUY or SELL.")
        if (body.price == null)
            errorMessages.add("price for the order is missing.")
        if (body.quantity == null)
            errorMessages.add("quantity field for order is missing.")
        if (body.orderType != null && body.orderType == "SELL" && body.esopType.isNullOrBlank()) {
            errorMessages.add("esopType is missing, SELL order requires esopType.")
        }
        if (errorMessages.isNotEmpty()) {
            response = mapOf("error" to errorMessages)
            return HttpResponse.status<Any>(HttpStatus.UNAUTHORIZED).body(response)
        }

        //Input Parsing
        val orderQuantity: Long? = body.quantity?.toLong()
        val orderType: String? = body.orderType?.trim()?.uppercase()
        val orderPrice: Long? = body.price?.toLong()
        val typeOfESOP: String = (body.esopType ?: "NON-PERFORMANCE").trim().uppercase()

        if (orderType !in arrayOf("BUY", "SELL"))
            errorMessages.add("Invalid order type.")
        if (typeOfESOP !in arrayOf("PERFORMANCE", "NON-PERFORMANCE"))
            errorMessages.add("Invalid type of ESOP, ESOP type should be PERFORMANCE or NON-PERFORMANCE.")

        if (errorMessages.isEmpty() && orderPrice != null && orderType != null && orderQuantity != null) {
            //Create Order
            DataStorage.userList[userName]!!.addOrderToExecutionQueue(orderQuantity, orderType, orderPrice, typeOfESOP)

            val res = mutableMapOf<String, Any>()
            res["quantity"] = orderQuantity
            res["order_type"] = orderType
            res["price"] = orderPrice

            return HttpResponse.status<Any>(HttpStatus.OK).body(res)

        }
        val res = mapOf("error" to errorMessages)
        return HttpResponse.status<Any>(HttpStatus.UNAUTHORIZED).body(res)
    }

}