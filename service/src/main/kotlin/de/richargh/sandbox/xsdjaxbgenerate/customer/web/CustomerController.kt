package de.richargh.sandbox.xsdjaxbgenerate.customer.web

import de.richargh.sandbox.xsdjaxbgenerate.customer.domain.CustomerFacade
import de.richargh.sandbox.xsdjaxbgenerate.customer.domain.CustomerId
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.tempuri.purchaseorderschema.Customer

@RestController
class CustomerController(
    private val customerFacade: CustomerFacade
) {

    @GetMapping("/customers/{id}")
    fun single(@PathVariable id: CustomerId) = customerFacade.byId(id).toDto()

}
