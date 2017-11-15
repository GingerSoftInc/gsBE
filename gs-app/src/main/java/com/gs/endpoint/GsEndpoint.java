package com.gs.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gs.service.GsService;

@RestController
public class GsEndpoint {
	
	@Autowired
	private GsService gsService;
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<String> getResponse(){
		return new ResponseEntity<>("Hola", HttpStatus.OK);
	}
	
	@PostMapping(value = "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> saveResponse(@RequestBody String body){
		return new ResponseEntity<>(gsService.saveResponse(body), HttpStatus.OK);
	}
	
}
