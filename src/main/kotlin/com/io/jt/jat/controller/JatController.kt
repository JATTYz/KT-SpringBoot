package com.io.jt.jat.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JatController() {

    @GetMapping("/messages")
    fun getMessage(): String = "Hello from docker"

}