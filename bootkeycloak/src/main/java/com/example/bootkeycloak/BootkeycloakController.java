package com.example.bootkeycloak;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
public class BootkeycloakController {

    @GetMapping(path = "/")
    public String index(){
        return "Visit /customers and /logout, see what happen. ";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model){
        return "customer: " + principal.getName();
    }

    @GetMapping(path = "logout")
    public String logout(HttpServletRequest request) throws ServletException {
       request.logout();
       return "logged out";
    }
}
