package com.example.users.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(
                new Info()
                    .title("Otus")
                    .version("2.11.0")
                    .contact(
                        new Contact()
                            .email("andrey1andrey@yandex.ru")
                            .url("http://kompasvideo.ru")
                            .name("Baryshnikov Andrey")
                    )
            );
    }
}
