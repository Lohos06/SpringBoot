package com.iim.springboot.controller;

import com.iim.springboot.model.metaux.Fer;
import com.iim.springboot.service.FerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fer")
public class FerController {

    private final FerService ferService;

    public FerController(FerService ferService) {
        this.ferService = ferService;
    }

    @GetMapping
    public Fer getById(@RequestParam long id){
        return ferService.getById(id);
    }

    @PostMapping
    public Fer create(
            @RequestParam String origine,
            @RequestParam float tauxCarbonne) {
        return ferService.create(origine, tauxCarbonne);
    }

}
