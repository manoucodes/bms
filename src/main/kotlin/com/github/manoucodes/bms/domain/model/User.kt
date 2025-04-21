package com.github.manoucodes.bms.domain.model

import com.github.manoucodes.bms.domain.enums.UserGlobalRole
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "users")
class User(
    @Id
    val id: UUID,
    @Column(nullable = false, unique = true)
    val email: String,
    @Column
    val name: String,
    @Column
    val phone: String? = null,
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val role: UserGlobalRole,
) : AuditableEntity()
