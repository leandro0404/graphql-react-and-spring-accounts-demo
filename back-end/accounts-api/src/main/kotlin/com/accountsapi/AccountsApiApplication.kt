package com.accountsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication
class AccountsApiApplication

fun main(args: Array<String>) {
	runApplication<AccountsApiApplication>(*args)
}
