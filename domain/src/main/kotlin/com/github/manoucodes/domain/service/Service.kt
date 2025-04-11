package com.github.manoucodes.domain.service

import com.github.manoucodes.domain.business.BusinessId
import java.time.Duration

data class Service(
    val id: ServiceId,
    val businessId: BusinessId,
    val name: String,
    val price: Double,
    val duration: Duration,
    val isActive: Boolean,
)
