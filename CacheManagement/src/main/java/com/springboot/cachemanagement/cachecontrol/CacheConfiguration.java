package com.springboot.cachemanagement.cachecontrol;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.springboot.cachemanagement.repository")
@EnableCaching
@Configuration
public class CacheConfiguration {

}