package com.accountsapi.repository

import com.accountsapi.model.Phone
import org.springframework.data.jpa.repository.JpaRepository


interface PhoneRepository : JpaRepository<Phone, Long> {
}