package com.accountsapi.dto.response

data class AccountResponseType (val id : Long, val phones : Collection<PhoneResponseType>)