package com.iim.springboot.service;

import com.iim.springboot.model.metaux.Or;
import org.springframework.stereotype.Service;

@Service
public class OrService {

    public Or create(String origine) {
        return new Or(origine);
    }

}
