package xyz.senius99.senius.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class AuthConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}