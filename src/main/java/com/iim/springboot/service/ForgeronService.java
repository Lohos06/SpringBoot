package com.iim.springboot.service;

import com.iim.springboot.model.Forgeron;
import com.iim.springboot.repository.FerRepository;
import com.iim.springboot.repository.ForgeronRepository;
import org.springframework.stereotype.Service;

@Service
public class ForgeronService {

    private final ForgeronRepository repository;
    public ForgeronService(ForgeronRepository repository) {
        this.repository = repository;
    }

    public Forgeron create(String nom, int maitrise) {
        Forgeron forgeron = new Forgeron(nom, maitrise);
        return repository.save(forgeron);
    }

    public Forgeron getById(Long id) {
        return repository.findById(id).get();
    }
}
