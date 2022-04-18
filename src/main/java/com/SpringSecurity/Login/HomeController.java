package com.SpringSecurity.Login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h2> HomeController </h2>
 * Specify the paths to access in Web
 */
@RestController
public class HomeController {

    /**
     * Home route will be accessed any time
     * @return
     */
    @GetMapping("/")
    public String home(){
        return "<h1> Welcome to Home Page </h1>";
    }


    /**
     * admin and user will be hidden under the authentication wall
     * @return
     */
    @GetMapping("/admin")
    public String admin(){
        return "<h1> Welcome Admin </h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1> Welcome User </h1>";
    }

}
