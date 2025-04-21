package com.github.manoucodes.bms.mapper

import com.github.manoucodes.bms.domain.enums.UserGlobalRole
import com.github.manoucodes.bms.domain.model.User
import com.github.manoucodes.bms.dto.CreateUserRequest
import java.util.UUID

object UserMapper {
    fun CreateUserRequest.toUser(): User =
        User(
            id = UUID.randomUUID(),
            name = this.name,
            email = this.email,
            role = UserGlobalRole.valueOf(this.role),
        )
}
