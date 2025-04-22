package com.github.manoucodes.bms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BmsApplication

fun main(args: Array<String>) {
    runApplication<BmsApplication>(*args)
}
