package com.github.manoucodes.domain.availability

import com.github.manoucodes.domain.staff.StafferId
import java.time.LocalDateTime

data class AvailabilitySlot(
    val id: AvailabilitySlotId,
    val stafferId: StafferId,
    val start: LocalDateTime,
    val end: LocalDateTime,
)
