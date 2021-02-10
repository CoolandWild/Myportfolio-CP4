package com.MyportfolioApi.MyportfolioApi.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.MyportfolioApi.MyportfolioApi.dtos.HobbieDto;
import com.MyportfolioApi.MyportfolioApi.entities.HobbieEntity;
import com.MyportfolioApi.MyportfolioApi.repositories.HobbieRepository;

@Component
public class HobbieMapper {


	@Autowired
	HobbieRepository hobbieRepository;
	
	public HobbieEntity createHobbie(HobbieDto dto) {
        HobbieEntity hobbie = new HobbieEntity();        
        hobbie.setTitle(dto.getTitle());
        hobbie.setPicture(dto.getPicture());
        return hobbie;
    }
}
