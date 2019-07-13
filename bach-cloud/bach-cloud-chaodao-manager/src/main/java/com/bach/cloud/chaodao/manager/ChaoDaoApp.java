package com.bach.cloud.chaodao.manager;

import com.bach.cloud.chaodao.manager.alarm.BachAlarmNotification;
import com.bach.cloud.chaodao.manager.chaodao.Test;
import com.bach.cloud.chaodao.manager.chaodao.ZTBug;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = Test.class,
        entityManagerFactoryRef = "customerEntityManagerFactory")
public class ChaoDaoApp {
    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.first")
    public DataSourceProperties firstDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource.first.configuration")
    public HikariDataSource firstDataSource() {
        return firstDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(firstDataSource())
                .packages(Test.class, ZTBug.class)
                .persistenceUnit("customers")
                .build();
    }


    public static void main(String[] args) {
        SpringApplication.run(ChaoDaoApp.class, args);
    }
}
