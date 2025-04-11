package com.github.manoucodes.domain.model.availability

import com.github.manoucodes.domain.model.staff.StafferId
import java.time.LocalDateTime

data class AvailabilitySlot(
    val id: AvailabilitySlotId,
    val stafferId: StafferId,
    val start: LocalDateTime,
    val end: LocalDateTime,
)
