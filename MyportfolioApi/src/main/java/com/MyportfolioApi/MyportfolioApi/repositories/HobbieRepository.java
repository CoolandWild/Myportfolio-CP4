package com.MyportfolioApi.MyportfolioApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyportfolioApi.MyportfolioApi.entities.HobbieEntity;

@Repository
public interface HobbieRepository extends JpaRepository<HobbieEntity, Long> {

}
