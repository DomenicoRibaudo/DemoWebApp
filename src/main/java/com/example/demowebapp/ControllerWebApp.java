package com.example.demowebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ControllerWebApp {

    @RequestMapping(method = RequestMethod.GET, path = "ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia) {
        if (nome.equals("Giuseppe") & provincia.equals("Lombardia")) {
        }
        return "Ciao" + " " + nome + " com'è il tempo in " + provincia;
    }

}
