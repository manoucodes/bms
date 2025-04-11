package com.github.manoucodes.domain.model.service

import com.github.manoucodes.domain.model.business.BusinessId
import java.time.Duration

data class Service(
    val id: ServiceId,
    val businessId: BusinessId,
    val name: String,
    val price: Double,
    val duration: Duration,
    val isActive: Boolean,
)
