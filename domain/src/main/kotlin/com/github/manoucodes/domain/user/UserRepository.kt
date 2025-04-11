package com.github.manoucodes.domain.user

interface UserRepository {
    fun findById(id: UserId): User?

    fun findByEmail(email: Email): User?

    fun save(user: User): User
}
