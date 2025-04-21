package com.github.manoucodes.bms.controller

import com.github.manoucodes.bms.domain.model.User
import com.github.manoucodes.bms.dto.CreateUserRequest
import com.github.manoucodes.bms.service.UserService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userService: UserService,
) {
    @PostMapping
    fun createUser(
        @RequestBody @Valid request: CreateUserRequest,
    ): ResponseEntity<User> {
        val createdUser = userService.createUser(request)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser)
    }
}
