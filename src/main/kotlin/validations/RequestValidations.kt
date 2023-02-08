package validations

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import models.CreateOrderInput

class RequestValidations {

    companion object {

        fun fieldsMissingInBodyOfOrderReq(body: CreateOrderInput): Map<String, *>? {

            val errorMessages: ArrayList<String> = ArrayList()

            var response: Map<String, *>?

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
                return response
            }
            return null
        }
    }
}