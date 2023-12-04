package com.typosaurus.productserviceapp;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackageClasses = ProductServiceAppPackageMarker.class)
@EnableJpaRepositories(basePackageClasses = ProductServiceAppPackageMarker.class)
@EntityScan(basePackageClasses = ProductServiceAppPackageMarker.class)
@PropertySource("classpath:data.sql")
@PropertySource("classpath:default-application.properties")
public class ProductServiceAppConfiguration {
}
