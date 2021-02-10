package com.MyportfolioApi.MyportfolioApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyportfolioApi.MyportfolioApi.repositories.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminrepository;
}
