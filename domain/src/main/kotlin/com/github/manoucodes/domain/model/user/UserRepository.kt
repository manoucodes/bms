package com.github.manoucodes.domain.model.user

import com.github.manoucodes.domain.user.Email

interface UserRepository {
    fun findById(id: UserId): User?

    fun findByEmail(email: Email): User?

    fun save(user: User): User
}
