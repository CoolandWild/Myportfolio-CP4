package com.MyportfolioApi.MyportfolioApi.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.MyportfolioApi.MyportfolioApi.dtos.JobDto;
import com.MyportfolioApi.MyportfolioApi.entities.JobEntity;
import com.MyportfolioApi.MyportfolioApi.repositories.JobRepository;


@Component
public class JobMapper {
	
	
	@Autowired
	JobRepository jobRepository;
	
	public JobEntity createJob(JobDto dto) {
        JobEntity job = new JobEntity();        
        job.setTitle(dto.getTitle());
        job.setEnterprise(dto.getEnterprise());
        job.setDate(dto.getEnterprise());
        return job;
    }
	

}
