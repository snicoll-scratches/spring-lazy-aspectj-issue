package com.example.springlazyaspectjissue;

import org.springframework.boot.LazyInitializationExcludeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@SpringBootApplication
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
public class SpringLazyAspectjIssueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLazyAspectjIssueApplication.class);
    }

	@Bean
	public static LazyInitializationExcludeFilter tas() {
		return LazyInitializationExcludeFilter.forBeanTypes(TransactionAspectSupport.class);
	}
}
