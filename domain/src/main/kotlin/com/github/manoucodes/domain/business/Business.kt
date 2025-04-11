package com.github.manoucodes.domain.business

import com.github.manoucodes.domain.staff.StafferId
import java.time.LocalDateTime

data class Business(
    val id: BusinessId,
    val name: String,
    val ownerId: StafferId,
    val address: String?,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
