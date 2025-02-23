package com.github.manoucodes.bms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookingManagementServiceApplication

fun main(args: Array<String>) {
	runApplication<BookingManagementServiceApplication>(*args)
}
