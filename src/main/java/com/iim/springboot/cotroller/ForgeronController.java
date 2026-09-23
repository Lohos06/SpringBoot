package com.iim.springboot.cotroller;

import com.iim.springboot.model.Forgeron;
import com.iim.springboot.service.forgeronService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forgeron")
public class ForgeronController {

    private final forgeronService forgeronService;

    public ForgeronController(forgeronService forgeronService) {
        this.forgeronService = forgeronService;
    }


    @GetMapping
    public String helloWorld() {
        return "HelloWorld";
    }

    @PostMapping
    public Forgeron create(@RequestParam String nom, @RequestParam int maitrise) {
        return forgeronService.create(nom, maitrise);
    }

}
