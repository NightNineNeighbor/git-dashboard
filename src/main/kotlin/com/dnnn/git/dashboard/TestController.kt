package com.dnnn.git.dashboard

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/ping")
    fun pong(@RequestParam param : String?) : String {
        return param?: "pong"
    }
}