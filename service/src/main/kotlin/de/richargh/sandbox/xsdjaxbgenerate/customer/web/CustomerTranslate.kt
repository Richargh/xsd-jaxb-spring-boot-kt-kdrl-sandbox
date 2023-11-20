package de.richargh.sandbox.xsdjaxbgenerate.customer.web

import de.richargh.sandbox.xsdjaxbgenerate.customer.domain.Customer
import org.tempuri.purchaseorderschema.Customer as CustomerDto

fun Customer.toDto() = CustomerDto().apply {
    dob
    address = CustomerDto.Address().apply {
        line1 = "Foo"
        line2 = "bar"
    }
}
