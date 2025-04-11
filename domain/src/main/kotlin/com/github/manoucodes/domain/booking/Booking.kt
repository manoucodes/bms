package com.github.manoucodes.domain.booking

import com.github.manoucodes.domain.service.ServiceId
import com.github.manoucodes.domain.staff.StafferId
import com.github.manoucodes.domain.user.UserId
import java.time.LocalDateTime

data class Booking(
    val id: BookingId,
    val clientId: UserId,
    val stafferId: StafferId,
    val serviceId: ServiceId,
    val start: LocalDateTime,
    val end: LocalDateTime,
    val status: BookingStatus,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
