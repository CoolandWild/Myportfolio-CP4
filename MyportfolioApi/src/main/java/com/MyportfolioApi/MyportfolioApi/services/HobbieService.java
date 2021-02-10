package com.MyportfolioApi.MyportfolioApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyportfolioApi.MyportfolioApi.dtos.HobbieDto;
import com.MyportfolioApi.MyportfolioApi.entities.HobbieEntity;
import com.MyportfolioApi.MyportfolioApi.exception.HobbieNotFoundException;
import com.MyportfolioApi.MyportfolioApi.mappers.HobbieMapper;
import com.MyportfolioApi.MyportfolioApi.repositories.HobbieRepository;

@Service
public class HobbieService {
	
	@Autowired
	HobbieRepository hobbieRepository;
	
	@Autowired
	HobbieMapper hobbieMapper;
	
	public HobbieEntity createHobbie(HobbieDto dto) {
        return hobbieRepository.save(hobbieMapper.createHobbie(dto));
    }
	public List<HobbieEntity> findAllHobbies() {
        return hobbieRepository.findAll();
    }
	public HobbieEntity findHobbieById(Long id) {
        return hobbieRepository.findById(id).orElseThrow(HobbieNotFoundException::new);
    }
}