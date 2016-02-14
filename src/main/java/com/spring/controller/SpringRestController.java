package com.spring.controller;

import java.util.List;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Participant;
import com.spring.service.ParticipantService;

/**
 * This is a test
 * 
 * @author yellams
 *
 */
@RestController
public class SpringRestController {
	
	@Autowired
	private ParticipantService participantService;
	
	@RequestMapping(value = "/participant", method = RequestMethod.GET)
	  public ResponseEntity<List<Participant>> listAllParticipant() {
	        List<Participant> participant = participantService.getParticipant();
	        if(participant.isEmpty()){
	            return new ResponseEntity<List<Participant>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<Participant>>(participant, HttpStatus.OK);
	    }
	 
	 
	
	

}
