package com.MyportfolioApi.MyportfolioApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyportfolioApi.MyportfolioApi.dtos.DiplomaDto;
import com.MyportfolioApi.MyportfolioApi.entities.DiplomaEntity;
import com.MyportfolioApi.MyportfolioApi.exception.DiplomaNotFoundException;
import com.MyportfolioApi.MyportfolioApi.mappers.DiplomaMapper;
import com.MyportfolioApi.MyportfolioApi.repositories.DiplomaRepository;

@Service
public class DiplomaService {

	@Autowired
	DiplomaRepository diplomaRepository;
	
	@Autowired
	DiplomaMapper diplomaMapper;
	
	public DiplomaEntity createDiploma(DiplomaDto dto) {
        return diplomaRepository.save(diplomaMapper.createDiploma(dto));
    }
	public List<DiplomaEntity> findAllDiplomas() {
        return diplomaRepository.findAll();
    }
	public DiplomaEntity findDiplomaById(Long id) {
        return diplomaRepository.findById(id).orElseThrow(DiplomaNotFoundException::new);
    }
}
