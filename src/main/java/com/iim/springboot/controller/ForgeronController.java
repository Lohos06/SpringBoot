package com.iim.springboot.controller;

import com.iim.springboot.model.Forgeron;
import com.iim.springboot.service.ForgeronService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forgeron")
public class ForgeronController {

    private final ForgeronService forgeronService;

    public ForgeronController(ForgeronService forgeronService) {
        this.forgeronService = forgeronService;
    }

    @GetMapping
    public Forgeron getById(@RequestParam long id){
        return forgeronService.getById(id);
    }

    @PostMapping
    public Forgeron create(@RequestParam String nom, @RequestParam int maitrise) {
        return forgeronService.create(nom, maitrise);
    }

    @PutMapping("/fonte")
    public Long fonte(@RequestParam Long id, @RequestParam String type) {
        return forgeronService.fonte(id, type);
    }

    @PutMapping("/forge")
    public Long forge(@RequestParam Long id, @RequestParam String type, String forme) {
        return forgeronService.forge(id, type, forme);
    }

}
