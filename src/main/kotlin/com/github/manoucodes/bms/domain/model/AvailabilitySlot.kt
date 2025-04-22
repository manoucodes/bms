package com.github.manoucodes.bms.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.ZonedDateTime
import java.util.UUID

@Entity
@Table(name = "availability_slots")
data class AvailabilitySlot(
    @Id
    val id: UUID,
    val stafferId: UUID,
    val startTime: ZonedDateTime,
    val endTime: ZonedDateTime,
)
