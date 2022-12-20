package com.accountsapi.adapter.impl

import com.accountsapi.dto.response.AccountResponseType
import com.accountsapi.adapter.AccountAdapter
import com.accountsapi.dto.input.CreateAccountInputType
import com.accountsapi.dto.input.CreatePhoneInputType
import com.accountsapi.dto.response.AccountAvatarType
import com.accountsapi.dto.response.AccountProfileType
import com.accountsapi.dto.response.PhoneResponseType
import com.accountsapi.model.Account
import com.accountsapi.model.Phone
import org.springframework.stereotype.Component


@Component
class AccountAdapterImpl : AccountAdapter {
    override fun toAccountResponseType(account: Account): AccountResponseType {
        return AccountResponseType(
            account.id,
            AccountProfileType(
                "example@gmail.com", AccountAvatarType(
                    "d6538595df6b4bce804738d8f0802d29",
                    url = "https://w7.pngwing.com/pngs/643/454/png-transparent-business-game-avatar-computer-program-google-smart-object-game-child-face.png"
                ),
                "meu profile name"
            ),
            toPhones(account)
        )
    }

    override fun toAccount(account: CreateAccountInputType): Account {
        return Account()
    }

    override fun toCreatePhone(account: Account, phone: CreatePhoneInputType): Phone {
        return Phone(
            country = phone.country,
            ddd = phone.ddd,
            value = phone.value,
            type = phone.type,
            account = account
        )
    }

    override fun toPhone(phone: Phone): PhoneResponseType {
        return toPhoneResponseType(phone)
    }

    private fun toPhones(account: Account): Collection<PhoneResponseType> {
        return account.phones?.map { p -> toPhoneResponseType(p) }?.toList() ?: emptyList()
    }

    private fun toPhoneResponseType(phone: Phone): PhoneResponseType {
        return PhoneResponseType(phone.id, phone.country, phone.ddd, phone.value, phone.type)
    }

}


