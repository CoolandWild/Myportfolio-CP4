package com.MyportfolioApi.MyportfolioApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyportfolioApi.MyportfolioApi.entities.DiplomaEntity;


@Repository
public interface DiplomaRepository extends JpaRepository<DiplomaEntity, Long> {

}
