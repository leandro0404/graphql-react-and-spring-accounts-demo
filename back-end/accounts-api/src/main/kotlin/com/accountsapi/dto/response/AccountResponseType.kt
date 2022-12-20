package com.accountsapi.dto.response

data class AccountResponseType(val id: Long, val profile : AccountProfileType, val phones: Collection<PhoneResponseType>)

data class AccountProfileType(val email: String, val avatar: AccountAvatarType, val name: String)

data class AccountAvatarType(val id: String, val url: String)