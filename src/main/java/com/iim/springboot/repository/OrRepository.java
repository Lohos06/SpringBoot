package com.iim.springboot.repository;

import com.iim.springboot.model.metaux.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface OrRepository extends JpaRepository<Or, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Or o SET o.forme = :forme WHERE o.id = :id")
    int updateForme(@Param("id") Long id, @Param("forme") String forme);
}
