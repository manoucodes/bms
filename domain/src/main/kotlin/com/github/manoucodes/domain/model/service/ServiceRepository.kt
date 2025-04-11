package com.github.manoucodes.domain.model.service

import com.github.manoucodes.domain.model.business.BusinessId

interface ServiceRepository {
    fun findById(id: ServiceId): Service?

    fun findByBusinessId(businessId: BusinessId): List<Service>

    fun save(service: Service): Service

    fun delete(id: ServiceId)
}
