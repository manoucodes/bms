package com.github.manoucodes.bms.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.ZonedDateTime
import java.util.UUID

@Entity
@Table(name = "bookings")
class Booking(
    @Id
    val id: UUID,
    val clientId: UUID,
    val stafferId: UUID,
    val serviceId: UUID,
    val startTime: ZonedDateTime,
    val endTime: ZonedDateTime,
    val status: String,
) : AuditableEntity()
