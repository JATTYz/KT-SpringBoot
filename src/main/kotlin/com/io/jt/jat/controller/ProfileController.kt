package com.io.jt.jat.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProfileController {

    @GetMapping("/test")
    fun test1() : String = "test-text "
}