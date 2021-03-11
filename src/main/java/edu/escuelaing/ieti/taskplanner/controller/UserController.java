package edu.escuelaing.ieti.taskplanner.controller;

import com.google.gson.Gson;
import edu.escuelaing.ieti.taskplanner.model.User;
import edu.escuelaing.ieti.taskplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String saludo(){
        return "Hola Mundo";
    }

    @GetMapping("/users")
    public String all(){
        return new Gson().toJson(userService.getAll());
    }
}
