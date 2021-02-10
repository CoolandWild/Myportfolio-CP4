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

import com.MyportfolioApi.MyportfolioApi.dtos.DiplomaDto;
import com.MyportfolioApi.MyportfolioApi.entities.DiplomaEntity;
import com.MyportfolioApi.MyportfolioApi.services.DiplomaService;

@RestController
@RequestMapping("/diplomas")
@CrossOrigin(methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS,RequestMethod.DELETE})
public class DiplomaController {

	

	@Autowired
    DiplomaService diplomaService;

    @PostMapping
    public ResponseEntity<DiplomaEntity> createDiploma(@RequestBody DiplomaDto dto) throws Exception {
        DiplomaEntity diplomaToCreate = diplomaService.createDiploma(dto);
        return new ResponseEntity<DiplomaEntity>(diplomaToCreate, HttpStatus.OK);
    }

    @GetMapping
    public List<DiplomaEntity> findAllDiplomas() {
        return diplomaService.findAllDiplomas();
    }

    @GetMapping("/{id}")
    public DiplomaEntity findDiplomaById(@PathVariable Long id) {
        return diplomaService.findDiplomaById(id);
    }
}
