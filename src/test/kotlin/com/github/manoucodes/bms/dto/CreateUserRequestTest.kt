package com.github.manoucodes.bms.dto

import jakarta.validation.Validation
import jakarta.validation.Validator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CreateUserRequestTest {
    private lateinit var validator: Validator

    private val role = "ADMIN"

    @BeforeEach
    fun setUp() {
        validator = Validation.buildDefaultValidatorFactory().validator
    }

    @Test
    fun `GIVEN correct input WHEN validating THEN the CreateUserRequest is valid`() {
        val request =
            CreateUserRequest(
                name = "John Doe",
                email = "john@example.com",
                role = role,
            )

        val violations = validator.validate(request)

        assertTrue(violations.isEmpty(), "Expected no validation errors")
    }

    @Test
    fun `GIVEN a blank name WHEN validating THEN the CreateUserRequest is invalid`() {
        val request =
            CreateUserRequest(
                name = "",
                email = "john@example.com",
                role = role,
            )

        val violations = validator.validate(request)
        val messages = violations.map { it.message }

        assertEquals(2, violations.size)
        assertTrue("Name is required" in messages)
        assertTrue("Name must be between 2 and 50 characters" in messages)
    }

    @Test
    fun `GIVEN an invalid email WHEN validating THEN the CreateUserRequest is invalid`() {
        val request =
            CreateUserRequest(
                name = "Jane",
                email = "not-an-email",
                role = role,
            )

        val violations = validator.validate(request)

        assertEquals(1, violations.size)
        assertEquals("Invalid email format", violations.first().message)
    }

    @Test
    fun `GIVEN a blank role WHEN validating THEN the CreateUserRequest is invalid`() {
        val request =
            CreateUserRequest(
                name = "Jane",
                email = "jane@example.com",
                role = "   ",
            )

        val violations = validator.validate(request)

        assertEquals(1, violations.size)
        assertEquals("Role is required", violations.first().message)
    }
}
