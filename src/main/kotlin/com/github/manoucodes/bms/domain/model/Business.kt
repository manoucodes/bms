package com.github.manoucodes.bms.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "businesses")
class Business(
    @Id
    val id: UUID,
    val name: String,
    val ownerId: UUID,
    val address: String?,
) : AuditableEntity()
