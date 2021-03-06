package com.MyportfolioApi.MyportfolioApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyportfolioApi.MyportfolioApi.entities.AdminEntity;


@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

}
