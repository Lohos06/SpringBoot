package com.iim.springboot.service;

import com.iim.springboot.model.metaux.Fer;
import org.springframework.stereotype.Service;

@Service
public class FerService {

    public Fer create(String origine, float tauxCarbonne) {
        return new Fer(origine, tauxCarbonne);
    }

}
