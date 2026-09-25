package com.iim.springboot.repository;

import com.iim.springboot.model.metaux.Fer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface FerRepository extends JpaRepository<Fer, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Fer f SET f.forme = :liquide WHERE f.id = :id")
    int updateForme(@Param("id") Long id, @Param("liquide") String liquide);
}
