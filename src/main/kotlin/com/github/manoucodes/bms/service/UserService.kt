package com.github.manoucodes.bms.service

import com.github.manoucodes.bms.domain.model.User
import com.github.manoucodes.bms.dto.CreateUserRequest
import com.github.manoucodes.bms.mapper.UserMapper.toUser
import com.github.manoucodes.bms.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    // TODO - ES - add tests
    fun createUser(userRequest: CreateUserRequest): User = userRepository.save(userRequest.toUser())
}
