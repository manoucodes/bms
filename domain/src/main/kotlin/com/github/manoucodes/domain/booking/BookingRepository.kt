package com.github.manoucodes.domain.booking

import com.github.manoucodes.domain.staff.StafferId
import com.github.manoucodes.domain.user.UserId
import java.time.LocalDateTime

interface BookingRepository {
    fun findById(id: BookingId): Booking?

    fun findByClientId(clientId: UserId): List<Booking>

    fun findByStafferId(stafferId: StafferId): List<Booking>

    fun findBetween(
        stafferId: StafferId,
        start: LocalDateTime,
        end: LocalDateTime,
    ): List<Booking>

    fun save(booking: Booking): Booking

    fun delete(id: BookingId)
}
