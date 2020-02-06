package com.example.exposedspringtransaction.config

import org.jetbrains.exposed.spring.SpringTransactionManager
import org.springframework.boot.autoconfigure.AutoConfigureAfter
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.sql.DataSource

@Configuration
@AutoConfigureAfter(DataSourceAutoConfiguration::class)
@EnableTransactionManagement
class DatabaseConfig {
    @Bean
    fun springTransactionManager (dataSource: DataSource) = SpringTransactionManager(dataSource)
}
