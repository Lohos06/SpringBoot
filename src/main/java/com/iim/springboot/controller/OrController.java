package com.iim.springboot.controller;

import com.iim.springboot.model.metaux.Or;
import com.iim.springboot.service.OrService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/or")
public class OrController {

    private final OrService orService;

    public OrController(OrService orService) {
        this.orService = orService;
    }

    @GetMapping
    public Or getById(@RequestParam long id){
        return orService.getById(id);
    }

    @PostMapping
    public Or create(
            @RequestParam String origine) {
        return orService.create(origine);
    }

}
