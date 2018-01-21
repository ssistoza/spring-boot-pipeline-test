package com.revature.SpringBootExample.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.SpringBootExample.beans.FlashCard;
import com.revature.SpringBootExample.service.FlashCardService;

@RestController
public class FlashCardCtrl {
	
	@Autowired
	FlashCardService fcService;
	
	/*
	 * Header: Content-ype = applicaiton/json
	 *   - Use @RequestBody
	 * Header: Content-type = application/x-www-form-urlencoded
	 *   - Form Data (@RequestBody or @PathVariable, not required) 
	 */
	@GetMapping("/fc/{id}")
	public FlashCard getFc(@PathVariable int id) {
		System.out.println("FlashCardCtrl -get");
		return fcService.getFc(id);
	}
	
	@PostMapping("/createFc")
	public ResponseEntity<FlashCard> createFc(@RequestBody FlashCard fc) {
		System.out.println("FlashCardCtrl -createFc");
		fc = fcService.createFlashCard(fc);
		return new ResponseEntity<FlashCard>(fc, HttpStatus.I_AM_A_TEAPOT);
	}
}
