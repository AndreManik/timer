package com.manik.timer.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DockerMessageController {
    @GetMapping("/messages")
    fun getMessage(): String {
        return "Hello from Docker!"
    }
}