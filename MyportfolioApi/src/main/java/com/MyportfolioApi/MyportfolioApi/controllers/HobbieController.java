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

import com.MyportfolioApi.MyportfolioApi.dtos.HobbieDto;
import com.MyportfolioApi.MyportfolioApi.entities.HobbieEntity;
import com.MyportfolioApi.MyportfolioApi.services.HobbieService;





@RestController
@RequestMapping("/hobbies")
@CrossOrigin(methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS,RequestMethod.DELETE})
public class  HobbieController {

	@Autowired
    HobbieService hobbieService;

    @PostMapping
    public ResponseEntity<HobbieEntity> createHobbie(@RequestBody HobbieDto dto) throws Exception {
        HobbieEntity hobbieToCreate = hobbieService.createHobbie(dto);
        return new ResponseEntity<HobbieEntity>(hobbieToCreate, HttpStatus.OK);
    }

    @GetMapping
    public List<HobbieEntity> findAllHobbies() {
        return hobbieService.findAllHobbies();
    }

    @GetMapping("/{id}")
    public HobbieEntity findJobById(@PathVariable Long id) {
        return hobbieService.findHobbieById(id);
    }

}

