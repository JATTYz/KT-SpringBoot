package com.io.jt.jat.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JatController() {

    @GetMapping("/messages")
    fun getMessage(): String = "Hello from docker"

    @GetMapping("/login")
    fun hello(model : Model, @AuthenticationPrincipal principal: OidcUser): String = "index"
}