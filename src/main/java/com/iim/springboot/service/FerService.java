package com.iim.springboot.service;

import com.iim.springboot.model.metaux.Fer;
import com.iim.springboot.repository.FerRepository;
import org.springframework.stereotype.Service;

@Service
public class FerService {

    private final FerRepository repository;

    public FerService(FerRepository repository) {
        this.repository = repository;
    }

    public Fer create(String origine, float tauxCarbonne) {
        Fer fer = new Fer(origine, tauxCarbonne);
        return repository.save(fer);
    }

    public Fer getById(Long id) {
        return repository.findById(id).get();
    }
}
