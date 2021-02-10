package com.MyportfolioApi.MyportfolioApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyportfolioApi.MyportfolioApi.entities.CreationEntity;

@Repository
public interface CreationRepository extends JpaRepository<CreationEntity, Long> {

}
