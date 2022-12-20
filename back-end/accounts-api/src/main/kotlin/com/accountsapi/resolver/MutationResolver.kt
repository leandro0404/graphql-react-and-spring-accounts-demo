package com.accountsapi.resolver

import com.accountsapi.adapter.AccountAdapter
import com.accountsapi.dto.input.CreateAccountInputType
import com.accountsapi.dto.input.CreatePhoneInputType
import com.accountsapi.dto.input.DeletePhoneInputType
import com.accountsapi.dto.response.AccountResponseType
import com.accountsapi.dto.response.PhoneResponseType
import com.accountsapi.repository.AccountRepository
import com.accountsapi.repository.PhoneRepository
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.springframework.stereotype.Component


@Component
class MutationResolver(
    private val accountRepository: AccountRepository,
    private val accountAdapter: AccountAdapter,
    private val phoneRepository: PhoneRepository
) : GraphQLMutationResolver {

    fun createAccount(account: CreateAccountInputType): AccountResponseType {
        val newAccount = accountRepository.save(accountAdapter.toAccount(account))
        return accountAdapter.toAccountResponseType(newAccount)
    }

    fun createPhone(phone: CreatePhoneInputType): PhoneResponseType {

        val newPhone = accountAdapter.toCreatePhone(accountRepository.findById(phone.account_id.toLong()).get(), phone)
        phoneRepository.save(newPhone)
        return accountAdapter.toPhone(newPhone)
    }

    fun deletePhone(phone: DeletePhoneInputType): Boolean {

        phoneRepository.deleteById(phone.id.toLong())
        return phoneRepository.findById(phone.id.toLong()).isEmpty

    }

}