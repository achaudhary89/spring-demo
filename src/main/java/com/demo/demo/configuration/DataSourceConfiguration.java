package com.demo.demo.configuration;

import com.demo.demo.model.SampleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class DataSourceConfiguration {
    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String password;

    @Value("${connection}")
    private String connectionString;

    @Bean
    public SampleDataSource sampleDataSource(){
        SampleDataSource sampleDataSource = new SampleDataSource();
        sampleDataSource.setUserName(userName);
        sampleDataSource.setPassword(password);
        sampleDataSource.setConnection(connectionString);

        return sampleDataSource;
    }


   /* @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/



}
