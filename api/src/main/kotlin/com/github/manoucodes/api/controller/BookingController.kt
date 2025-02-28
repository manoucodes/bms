package com.github.manoucodes.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/bookings")
class BookingController {
    @GetMapping("/booking/{id}")
    fun findBooking(
        @PathVariable id: Long,
    ): String = "Booking: $id"
}