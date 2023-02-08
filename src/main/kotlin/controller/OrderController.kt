package controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import models.CreateOrderInput
import models.DataStorage
import services.Validations
import validations.RequestValidations
import validations.UserValidations

@Controller("/user")
class OrderController {
    @Post("/{userName}/createOrder")
    fun createOrder(userName: String, @Body body: CreateOrderInput): HttpResponse<*> {
        var response: Map<String, *>?

        response = UserValidations.validateUser(userName)
        if (response != null)
            return HttpResponse.status<Any>(HttpStatus.UNAUTHORIZED).body(response)


        response = RequestValidations.checkIfRequestIsValid(body)
        if (response != null)
            return HttpResponse.status<Any>(HttpStatus.UNAUTHORIZED).body(response)

        val orderQuantity: Long = body.quantity!!.toLong()
        val orderType: String = body.orderType!!.trim().uppercase()
        val orderPrice: Long = body.price!!.toLong()
        val typeOfESOP: String = (body.esopType ?: "NON-PERFORMANCE").trim().uppercase()


        //Create Order
        DataStorage.userList[userName]!!.addOrderToExecutionQueue(orderQuantity, orderType, orderPrice, typeOfESOP)

        val res = mutableMapOf<String, Any>()
        res["quantity"] = orderQuantity
        res["order_type"] = orderType
        res["price"] = orderPrice

        return HttpResponse.status<Any>(HttpStatus.OK).body(res)


    }

}