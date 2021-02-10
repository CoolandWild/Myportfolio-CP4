package com.MyportfolioApi.MyportfolioApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyportfolioApi.MyportfolioApi.entities.JobEntity;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Long> {

}
