package com.github.manoucodes.domain.model.availability

import com.github.manoucodes.domain.model.staff.StafferId
import java.time.LocalDateTime

interface AvailabilitySlotRepository {
    fun findById(id: AvailabilitySlotId): AvailabilitySlot?

    fun findByStafferId(stafferId: StafferId): List<AvailabilitySlot>

    fun findBetween(
        stafferId: StafferId,
        start: LocalDateTime,
        end: LocalDateTime,
    ): List<AvailabilitySlot>

    fun save(slot: AvailabilitySlot): AvailabilitySlot

    fun delete(id: AvailabilitySlotId)
}
