package com.iim.springboot.cotroller;

import com.iim.springboot.model.metaux.Or;
import com.iim.springboot.service.OrService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/or")
public class OrController {

    private final OrService orService;

    public OrController(OrService orService) {
        this.orService = orService;
    }

    @PostMapping
    public Or create(@RequestParam String origine) {
        return orService.create(origine);
    }

}
