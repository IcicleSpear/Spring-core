package com.spring.Assignment.com.spring.assignment;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
    public Project project1() {
        return new Project(201, "6 months", 50000.0);
    }

    @Bean
    public Project project2() {
        return new Project(202, "3 months", 250000.0);
    }

    @Bean
    public Project project3() {
        return new Project(203, "7 months", 350000.0);
    }

    @Bean(name="e1")
    public Employee employee1() {
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("home", "Chennai");
        addressMap.put("office", "Bangalore");
        return new Employee(101, "Abhishek", 70000.0, addressMap, project1());
    }

    @Bean(name="e2")
    public Employee employee2() {
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("home", "Coimbatore");
        addressMap.put("office", "Hyderabad");
        return new Employee(102, "Ramesh", 65000.0, addressMap, project2());
    }

    @Bean(name="e3")
    public Employee employee3() {
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("home", "Madurai");
        addressMap.put("office", "Mumbai");
        return new Employee(103, "Suresh", 55000.0, addressMap, project3());
    }
	
	

}
