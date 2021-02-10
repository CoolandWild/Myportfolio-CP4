package com.MyportfolioApi.MyportfolioApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyportfolioApi.MyportfolioApi.dtos.CreationDto;
import com.MyportfolioApi.MyportfolioApi.entities.CreationEntity;
import com.MyportfolioApi.MyportfolioApi.exception.CreationNotFoundException;
import com.MyportfolioApi.MyportfolioApi.mappers.CreationMapper;
import com.MyportfolioApi.MyportfolioApi.repositories.CreationRepository;

@Service
public class CreationService {

	@Autowired
	CreationRepository creationRepository;
	
	@Autowired
	CreationMapper creationMapper;
	
	public CreationEntity createCreation(CreationDto dto) {
        return creationRepository.save(creationMapper.createCreation(dto));
    }
	public List<CreationEntity> findAllCreations() {
        return creationRepository.findAll();
    }
	public CreationEntity findCreationById(Long id) {
        return creationRepository.findById(id).orElseThrow(CreationNotFoundException::new);
    }
}
