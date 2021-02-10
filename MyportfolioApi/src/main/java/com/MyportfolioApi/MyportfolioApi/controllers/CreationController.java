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

import com.MyportfolioApi.MyportfolioApi.dtos.CreationDto;
import com.MyportfolioApi.MyportfolioApi.entities.CreationEntity;
import com.MyportfolioApi.MyportfolioApi.services.CreationService;

@RestController
@RequestMapping("/creations")
@CrossOrigin(methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS,RequestMethod.DELETE})
public class CreationController {


	@Autowired
    CreationService creationService;

    @PostMapping
    public ResponseEntity<CreationEntity> createCreation(@RequestBody CreationDto dto) throws Exception {
        CreationEntity creationToCreate = creationService.createCreation(dto);
        return new ResponseEntity<CreationEntity>(creationToCreate, HttpStatus.OK);
    }

    @GetMapping
    public List<CreationEntity> findAllCreations() {
        return creationService.findAllCreations();
    }

    @GetMapping("/{id}")
    public CreationEntity findCreationById(@PathVariable Long id) {
        return creationService.findCreationById(id);
    }
}
