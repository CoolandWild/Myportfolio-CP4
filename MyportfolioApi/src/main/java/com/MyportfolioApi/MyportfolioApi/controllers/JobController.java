package com.MyportfolioApi.MyportfolioApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MyportfolioApi.MyportfolioApi.dtos.JobDto;
import com.MyportfolioApi.MyportfolioApi.entities.JobEntity;
import com.MyportfolioApi.MyportfolioApi.services.JobService;


@RestController
@RequestMapping("/jobs")
@CrossOrigin(methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS,RequestMethod.DELETE})
public class JobController {

	@Autowired
    JobService jobService;

    @PostMapping
    public ResponseEntity<JobEntity> createJob(@RequestBody JobDto dto) throws Exception {
        JobEntity jobToCreate = jobService.createJob(dto);
        return new ResponseEntity<JobEntity>(jobToCreate, HttpStatus.OK);
    }

    @GetMapping
    public List<JobEntity> findAllJobs() {
        return jobService.findAllJobs();
    }

    @GetMapping("/{id}")
    public JobEntity findJobById(@PathVariable Long id) {
        return jobService.findJobById(id);
    }

}
