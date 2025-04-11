package com.github.manoucodes.domain.model.business

interface BusinessRepository {
    fun findById(id: BusinessId): Business?

    fun save(store: Business): Business
}
