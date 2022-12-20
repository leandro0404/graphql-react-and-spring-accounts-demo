package com.accountsapi.dto.input

import com.accountsapi.model.PhoneType


data class CreatePhoneInputType(
    val account_id: Int,
    val country: Int,
    val value: String,
    val ddd: String,
    val type: PhoneType
)
