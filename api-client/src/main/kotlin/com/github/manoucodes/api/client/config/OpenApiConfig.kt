package com.github.manoucodes.api.client.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Profile("staging")
@Configuration
class OpenApiConfig {
    @Bean
    fun customOpenAPI(): OpenAPI =
        OpenAPI()
            .info(
                Info()
                    .title("Booking Management Service API")
                    .version("1.0.0")
                    .description("Staging Environment"),
            ).servers(
                listOf(
                    Server().url("https://bms-staging.up.railway.app"),
                ),
            )
}
