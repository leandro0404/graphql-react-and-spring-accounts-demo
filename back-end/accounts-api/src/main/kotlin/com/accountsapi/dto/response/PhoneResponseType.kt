package com.accountsapi.dto.response

import com.accountsapi.model.PhoneType

data class PhoneResponseType(
    val id: Long,
    val country: Int,
    val ddd: String,
    val value: String,
    val type: PhoneType
)