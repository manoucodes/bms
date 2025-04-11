package com.github.manoucodes.domain.model.user

import com.github.manoucodes.domain.user.Email
import java.time.LocalDateTime

data class User(
    val id: UserId,
    val email: Email,
    val name: String,
    val phone: Phone,
    val role: UserGlobalRole = UserGlobalRole.USER,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
