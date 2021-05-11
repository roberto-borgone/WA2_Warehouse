package it.polito.wa2.lab4.warehouse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WarehouseApplication

fun main(args: Array<String>) {
    runApplication<WarehouseApplication>(*args)
}
