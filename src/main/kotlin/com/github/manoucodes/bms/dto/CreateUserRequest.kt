package com.github.manoucodes.bms.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class CreateUserRequest(
    @field:NotBlank(message = "Name is required")
    @field:Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    val name: String,
    @field:Email(message = "Invalid email format")
    val email: String,
    @field:NotBlank(message = "Role is required")
    val role: String,
)
