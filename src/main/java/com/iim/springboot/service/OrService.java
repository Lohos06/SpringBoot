package com.iim.springboot.service;

import com.iim.springboot.model.metaux.Or;
import com.iim.springboot.repository.OrRepository;
import org.springframework.stereotype.Service;

@Service
public class OrService {

    private final OrRepository repository;

    public OrService(OrRepository repository) {
        this.repository = repository;
    }

    public Or create(String origine) {
        Or or = new Or(origine);
        return repository.save(or);
    }

    public Or getById(Long id) {
        return repository.findById(id).get();
    }
}
