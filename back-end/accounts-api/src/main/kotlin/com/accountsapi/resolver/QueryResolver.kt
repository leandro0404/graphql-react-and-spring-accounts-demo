package com.accountsapi.resolver

import com.accountsapi.dto.response.AccountResponseType
import com.accountsapi.adapter.AccountAdapter
import com.accountsapi.repository.AccountRepository
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryResolver(
    private val accountRepository: AccountRepository,
    private val accountAdapter: AccountAdapter
)  : GraphQLQueryResolver {

    fun findAccount(id: Long): AccountResponseType = accountAdapter.toAccountResponseType(accountRepository.findById(id).get())
}