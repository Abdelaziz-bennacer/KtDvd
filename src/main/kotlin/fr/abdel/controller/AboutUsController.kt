package fr.abdel.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class AboutUsController {

    @RequestMapping("/about-us")
    fun displayFullDetails():String{
        println("Tentative d'affichage de l'a-propos")
        return ""
    }
}