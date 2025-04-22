package com.github.manoucodes.bms.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "staffers")
class Staffer(
    @Id
    val id: UUID,
    val userId: UUID,
    val businessId: UUID,
    val role: UUID,
    val isActive: Boolean,
) : AuditableEntity()
