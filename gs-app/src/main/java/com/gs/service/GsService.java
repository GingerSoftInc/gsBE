package com.gs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.dao.InfoDAO;
import com.gs.entities.Info;

@Service
public class GsService {
	
	@Autowired
	private InfoDAO infoDao;
	@Autowired
	private Info infoEntity;

	public String saveResponse(String body){
		infoEntity.setName(body);
		infoDao.saveEntity(infoEntity);
		
		return "Save";
	}
}
