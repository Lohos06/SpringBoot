package com.iim.springboot.service;

import com.iim.springboot.model.Forgeron;
import org.springframework.stereotype.Service;

@Service
public class forgeronService {

    public Forgeron create(String nom, int maitrise) {
        return new Forgeron(nom, maitrise);
    }

}
