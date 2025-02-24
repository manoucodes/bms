package com.github.manoucodes.api.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SwaggerRedirectController {

    @GetMapping("/")
    fun redirectToSwagger(): String {
        return "redirect:/swagger-ui.html"
    }
}