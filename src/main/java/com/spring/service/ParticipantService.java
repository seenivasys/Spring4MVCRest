package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dao.ParticipantDao;
import com.spring.model.Participant;

@Component
public class ParticipantService {

@Autowired
private ParticipantDao participantDao;
	
	public List<Participant> getParticipant(){
		return  participantDao.selectParticipantList();
	}
	
	public void insert(Participant participant){
		participantDao.insertParticipant(participant);
	}
	
	public boolean delete(int id){
		return participantDao.deleteParticipant(id);
	}

	public boolean update(Participant participant) {
		return participantDao.updateParticipant(participant);
	}

	public Participant getParticipant(int pId) {
		return participantDao.getParticipant(pId);
	}
}
