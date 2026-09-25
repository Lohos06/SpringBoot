package com.iim.springboot.repository;

import com.iim.springboot.model.metaux.Fer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FerRepository extends JpaRepository<Fer, Long> {
}
