package com.gs.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gsEndpoint {
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<String> getResponse(){
		return new ResponseEntity<>("Hola", HttpStatus.OK);
	}
	
}
