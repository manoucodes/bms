package com.github.manoucodes.domain.model.business

import com.github.manoucodes.domain.model.staff.StafferId
import java.time.LocalDateTime

data class Business(
    val id: BusinessId,
    val name: String,
    val ownerId: StafferId,
    val address: String?,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
