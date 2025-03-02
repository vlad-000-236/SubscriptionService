package com.VI__236.SubscriptionService.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@PropertySource("classpath:application.properties")
@Configuration
@Component
@EnableTransactionManagement
@EnableJpaRepositories("com.VI__236.SubscriptionService.repositories")
public class HibernateConfig {


    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("${spring.datasource.driverClassName}");
        dataSource.setUrl("${spring.datasource.url}");
        dataSource.setUsername("${spring.datasource.username}");
        dataSource.setPassword("${spring.datasource.password}");

        return dataSource;
    }


    private Properties hibernateProperties(){
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "${spring.jpa.properties.hibernate.dialect}");
        properties.put("hibernate.show-sql", "${spring.jpa.show-sql}");

        return properties;
    }


    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.VI__236.SubscriptionService.models");
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory();
    }


    public PlatformTransactionManager hibernateTransactionManager(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory((sessionFactory().getObject()));

        return transactionManager;
    }
}
