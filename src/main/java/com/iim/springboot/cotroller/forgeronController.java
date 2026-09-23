package com.iim.springboot.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class forgeronController {

    @GetMapping
    public String helloWorld() {
        return "HelloWorld";
    }

}
