package com.github.manoucodes.domain.business

interface BusinessRepository {
    fun findById(id: BusinessId): Business?

    fun save(store: Business): Business
}
