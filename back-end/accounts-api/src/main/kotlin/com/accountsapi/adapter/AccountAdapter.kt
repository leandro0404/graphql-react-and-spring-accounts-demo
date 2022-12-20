package com.accountsapi.adapter

import com.accountsapi.dto.input.CreateAccountInputType
import com.accountsapi.dto.input.CreatePhoneInputType
import com.accountsapi.dto.response.AccountResponseType
import com.accountsapi.dto.response.PhoneResponseType
import com.accountsapi.model.Account
import com.accountsapi.model.Phone

interface AccountAdapter {

    fun toAccountResponseType(account: Account): AccountResponseType
    fun toAccount(account: CreateAccountInputType): Account
    fun toCreatePhone(account: Account, phone: CreatePhoneInputType): Phone
    fun toPhone(phone: Phone): PhoneResponseType
}