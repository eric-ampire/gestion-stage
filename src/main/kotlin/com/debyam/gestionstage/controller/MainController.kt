package com.debyam.gestionstage.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class MainController {

    @GetMapping("/")
    fun index(model: Model): String {
        model["name"] = "Eric AMpire"
        return "index"
    }
}