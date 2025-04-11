package com.github.manoucodes.domain.staff

import com.github.manoucodes.domain.business.BusinessId
import com.github.manoucodes.domain.user.UserId

interface StafferRepository {
    fun findById(id: StafferId): Staffer?

    fun findByUserId(userId: UserId): List<Staffer>

    fun findByStoreId(businessId: BusinessId): List<Staffer>

    fun save(staffer: Staffer): Staffer
}
