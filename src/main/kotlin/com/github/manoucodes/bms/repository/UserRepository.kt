package com.github.manoucodes.bms.repository

import com.github.manoucodes.bms.domain.model.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID>
