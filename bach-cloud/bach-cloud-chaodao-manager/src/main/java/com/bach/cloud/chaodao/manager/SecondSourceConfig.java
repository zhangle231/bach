package com.bach.cloud.chaodao.manager;

import com.bach.cloud.chaodao.manager.alarm.BachAlarmNotification;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackageClasses = BachAlarmNotification.class,
        entityManagerFactoryRef = "alarmEntityManagerFactory")
public class SecondSourceConfig {
    @Bean
    public LocalContainerEntityManagerFactoryBean alarmEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(secondDataSource())
                .packages(BachAlarmNotification.class)
                .persistenceUnit("alarm-notification")
                .build();
    }
    @Bean
    @ConfigurationProperties("app.datasource.second")
    public DataSourceProperties secondDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Bean
    @ConfigurationProperties("app.datasource.second.configuration")
    public HikariDataSource secondDataSource() {
        return secondDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
}
