package com.example.kotlinservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RestService {
    @GetMapping fun hello() = "Hello Faggruppe!"
}