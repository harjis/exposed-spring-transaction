package com.example.exposedspringtransaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExposedSpringTransactionApplication

fun main(args: Array<String>) {
	runApplication<ExposedSpringTransactionApplication>(*args)
}
