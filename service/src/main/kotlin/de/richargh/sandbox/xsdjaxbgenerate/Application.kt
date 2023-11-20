package de.richargh.sandbox.xsdjaxbgenerate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args) {
		addInitializers(beans {
		})
	}
}
