package com.aasctc.template_rules;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LuceneConfig {

    @Bean
    public IndexSearcherManager indexSearcherManager() throws IOException {
        // Create and configure your IndexSearcherManager
        return new IndexSearcherManager();
    }
}