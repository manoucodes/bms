package com.github.manoucodes.domain.user

import java.time.LocalDateTime

data class User(
    val id: UserId,
    val email: String,
    val name: String,
    val phone: Phone,
    val role: UserGlobalRole = UserGlobalRole.USER,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
