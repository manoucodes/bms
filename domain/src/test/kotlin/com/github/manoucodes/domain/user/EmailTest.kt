package com.github.manoucodes.domain.user

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class EmailTest {
    @Test
    fun `GIVEN a valid email THEN an email is created`() {
        val email = Email("User@Example.com")
        assertEquals("user@example.com", email.toString())
    }

    @Test
    fun `GIVEN a blank email THEN an exception is thrown`() {
        val exception =
            assertThrows<IllegalArgumentException> {
                Email("   ")
            }
        assertEquals("Email cannot be blank", exception.message)
    }

    @Test
    fun `GIVEN an email without the @ symbol THEN an exception is thrown`() {
        val exception =
            assertThrows<IllegalArgumentException> {
                Email("invalid-email.com")
            }
        thenInvalidEmailFormatMessageIsReturned(exception)
    }

    @Test
    fun `GIVEN an email without a domain THEN an exception is thrown`() {
        val exception =
            assertThrows<IllegalArgumentException> {
                Email("test@")
            }
        thenInvalidEmailFormatMessageIsReturned(exception)
    }

    @Test
    fun `GIVEN an email with whitespace THEN an exception is thrown`() {
        val exception =
            assertThrows<IllegalArgumentException> {
                Email("test @example.com")
            }
        thenInvalidEmailFormatMessageIsReturned(exception)
    }

    private fun thenInvalidEmailFormatMessageIsReturned(exception: IllegalArgumentException) {
        assertTrue(exception.message!!.contains("Invalid email format"))
    }
}
