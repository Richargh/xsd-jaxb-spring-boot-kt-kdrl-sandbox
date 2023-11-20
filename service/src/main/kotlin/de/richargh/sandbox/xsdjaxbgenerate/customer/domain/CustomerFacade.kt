package de.richargh.sandbox.xsdjaxbgenerate.customer.domain

import org.springframework.stereotype.Service
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

@Service
class CustomerFacade {

    private val allCustomers = ConcurrentHashMap<CustomerId, Customer>().apply {
        Customer(CustomerId("1"), "Alex").let { put(it.id, it) }
        Customer(CustomerId("2"), "Taylor").let { put(it.id, it) }
    }

    fun byId(id: CustomerId): Customer = allCustomers[id]!!

    fun add(customer: Customer) {
        allCustomers[customer.id] = customer
    }

}