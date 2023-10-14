package com.darglk.orms.config;

import org.jooq.DSLContext;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy

import org.jooq.impl.DataSourceConnectionProvider
import org.jooq.impl.DefaultExecuteListenerProvider

@Configuration
class JooqConfiguration(
    private val dataSource: DataSource
) {
    @Bean
    fun dsl(): DSLContext {
        return DefaultDSLContext(configuration())
    }
    
    @Bean
    fun configuration(): org.jooq.Configuration {
        var jooqConfiguration: DefaultConfiguration = DefaultConfiguration()
        jooqConfiguration.set(connectionProvider())
        jooqConfiguration.set(DefaultExecuteListenerProvider(exceptionTransformer()))
        return jooqConfiguration
    }
    
    @Bean
    fun connectionProvider(): DataSourceConnectionProvider {
        return DataSourceConnectionProvider(TransactionAwareDataSourceProxy(dataSource))
    }
}
