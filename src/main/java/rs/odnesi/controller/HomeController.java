package rs.odnesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Milan on 31/08/2016.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "pozdrav svima";
    }
}
