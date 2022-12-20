package com.accountsapi.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter
import javax.servlet.Filter

@Configuration
class LazyFilter {
    @Bean
    fun openSessionInView(): Filter {
        return OpenEntityManagerInViewFilter()
    }
}