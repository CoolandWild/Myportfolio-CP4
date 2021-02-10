package com.MyportfolioApi.MyportfolioApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyportfolioApi.MyportfolioApi.dtos.JobDto;
import com.MyportfolioApi.MyportfolioApi.entities.JobEntity;
import com.MyportfolioApi.MyportfolioApi.exception.JobNotFoundException;
import com.MyportfolioApi.MyportfolioApi.mappers.JobMapper;
import com.MyportfolioApi.MyportfolioApi.repositories.JobRepository;




@Service
public class JobService {
	
	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	JobMapper jobMapper;
	
	public JobEntity createJob(JobDto dto) {
        return jobRepository.save(jobMapper.createJob(dto));
    }
	public List<JobEntity> findAllJobs() {
        return jobRepository.findAll();
    }
	public JobEntity findJobById(Long id) {
        return jobRepository.findById(id).orElseThrow(JobNotFoundException::new);
    }
}
