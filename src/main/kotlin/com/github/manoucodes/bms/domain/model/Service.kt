package com.github.manoucodes.bms.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Duration
import java.util.UUID

@Entity
@Table(name = "services")
data class Service(
    @Id
    val id: UUID,
    val businessId: UUID,
    val name: String,
    val price: Double,
    val duration: Duration,
    val isActive: Boolean,
)
