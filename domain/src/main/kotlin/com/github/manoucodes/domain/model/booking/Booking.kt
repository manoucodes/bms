package com.github.manoucodes.domain.model.booking

import com.github.manoucodes.domain.model.service.ServiceId
import com.github.manoucodes.domain.model.staff.StafferId
import com.github.manoucodes.domain.model.user.UserId
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
