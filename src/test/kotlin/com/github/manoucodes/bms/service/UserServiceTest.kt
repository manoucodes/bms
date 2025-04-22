package com.github.manoucodes.bms.service

import com.github.manoucodes.bms.dto.CreateUserRequest
import com.github.manoucodes.bms.mapper.UserMapper.toUser
import com.github.manoucodes.bms.repository.UserRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class UserServiceTest {
    @MockK
    private lateinit var userRepository: UserRepository

    @InjectMockKs
    private lateinit var sut: UserService

    @BeforeEach
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `GIVEN valid CreateUserRequest WHEN createUser THEN save user and return result`() {
        // GIVEN
        val request =
            CreateUserRequest(
                name = "John",
                email = "john@example.com",
                role = "ADMIN",
            )
        val user = request.toUser()

        every { userRepository.save(any()) } returns user

        // WHEN
        val result = sut.createUser(request)

        // THEN
        assertEquals(user.name, result.name)
        assertEquals(user.email, result.email)
        assertEquals(user.role, result.role)
        verify(exactly = 1) { userRepository.save(match { it.email == "john@example.com" }) }
    }
}
