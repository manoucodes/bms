package com.github.manoucodes.domain.staff

import com.github.manoucodes.domain.business.BusinessId
import com.github.manoucodes.domain.user.UserId
import java.time.LocalDateTime

data class Staffer(
    val id: StafferId,
    val userId: UserId,
    val businessId: BusinessId,
    val role: StafferRole,
    val isActive: Boolean,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
