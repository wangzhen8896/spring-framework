package com.wz.debug.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CityService {

	@PostConstruct
	public void init(){
		System.out.println("init ");
	}
}
