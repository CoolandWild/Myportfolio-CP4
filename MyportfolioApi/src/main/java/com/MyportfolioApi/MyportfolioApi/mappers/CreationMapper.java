package com.MyportfolioApi.MyportfolioApi.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.MyportfolioApi.MyportfolioApi.dtos.CreationDto;
import com.MyportfolioApi.MyportfolioApi.entities.CreationEntity;
import com.MyportfolioApi.MyportfolioApi.repositories.CreationRepository;

@Component
public class CreationMapper {

	@Autowired
	CreationRepository creationRepository;
	
	public CreationEntity createCreation(CreationDto dto) {
        CreationEntity creation = new CreationEntity();        
        creation.setTitle(dto.getTitle());
        creation.setBody(dto.getBody());
        creation.setPicture(dto.getPicture());
        return creation;
    }
}
