package edu.escuelaing.ieti.taskplanner.controller;

import edu.escuelaing.ieti.taskplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String saludo(){
        return "Hola Mundo";
    }
}
