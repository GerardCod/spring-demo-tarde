package com.ibm.academia.springdemotarde.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aoi/v1")
public class RamiroController {
	
	@GetMapping("ramiro")
	public ResponseEntity<String> ramiro(){
		
		return ResponseEntity.ok("Ramiro");
	}

}
