package com.github.manoucodes.api.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

const val SWAGGER_ENDPOINT = "/swagger-ui.html"

@Controller
class SwaggerRedirectController {
    @GetMapping("/")
    fun redirectToSwagger(): String = "redirect:$SWAGGER_ENDPOINT"
}
