package com.revature.SpringBootExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.SpringBootExample.beans.FlashCard;
import com.revature.SpringBootExample.repository.FlashCardRepo;

@Service
public class FlashCardService {

	@Autowired
	FlashCardRepo fcRepo;
	
	public FlashCard getFc(int fcId) {
		System.out.println("service - getFc");
		return fcRepo.findOne(fcId);
	}
	
	public FlashCard createFlashCard(FlashCard fc) {
		System.out.println("Service -createFc");
		fcRepo.save(fc);
		return fc;
	}
	
}
