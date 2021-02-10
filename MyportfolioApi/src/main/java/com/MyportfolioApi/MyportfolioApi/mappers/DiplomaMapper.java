package com.MyportfolioApi.MyportfolioApi.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.MyportfolioApi.MyportfolioApi.dtos.DiplomaDto;
import com.MyportfolioApi.MyportfolioApi.entities.DiplomaEntity;
import com.MyportfolioApi.MyportfolioApi.repositories.DiplomaRepository;

@Component
public class DiplomaMapper {

	@Autowired
	DiplomaRepository diplomaRepository;
	
	public DiplomaEntity createDiploma(DiplomaDto dto) {
        DiplomaEntity diploma = new DiplomaEntity();        
        diploma.setTitle(dto.getTitle());
        diploma.setDate(dto.getDate());
        return diploma;
    }
}
