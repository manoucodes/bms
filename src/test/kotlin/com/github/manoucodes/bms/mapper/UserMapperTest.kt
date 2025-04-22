package com.github.manoucodes.bms.mapper

import com.github.manoucodes.bms.domain.enums.UserGlobalRole
import com.github.manoucodes.bms.domain.model.User
import com.github.manoucodes.bms.dto.CreateUserRequest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class UserMapperTest {
    @Test
    fun `GIVEN valid CreateUserRequest WHEN mapping THEN return correct User`() {
        // GIVEN
        val request =
            CreateUserRequest(
                name = "Alice",
                email = "alice@example.com",
                role = "ADMIN",
            )

        // WHEN
        val user: User = with(UserMapper) { request.toUser() }

        // THEN
        assertEquals("Alice", user.name)
        assertEquals("alice@example.com", user.email)
        assertEquals(UserGlobalRole.ADMIN, user.role)
        assertNotNull(user.id)
    }

    @Test
    fun `GIVEN invalid role WHEN mapping THEN throw IllegalArgumentException`() {
        val request =
            CreateUserRequest(
                name = "Bob",
                email = "bob@example.com",
                role = "NOT_A_ROLE",
            )

        assertThrows(IllegalArgumentException::class.java) {
            with(UserMapper) { request.toUser() }
        }
    }
}
