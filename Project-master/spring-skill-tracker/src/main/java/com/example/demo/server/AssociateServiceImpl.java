package com.example.demo.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Associate;

public class AssociateServiceImpl implements AssociateService {
	
	@Autowired
	private AssociateService associateService;

	@Override
	public List<Associate> getAssociates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAssociate(Associate theAssociate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Associate getAssociate(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAssociate(int theId) {
		// TODO Auto-generated method stub
		
	}

}
