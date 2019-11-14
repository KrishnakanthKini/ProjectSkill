package com.example.demo.server;

import java.util.List;

import com.example.demo.entity.Associate;

public interface AssociateService {
	
	public List<Associate> getAssociates();

	public void saveAssociate(Associate theAssociate);

	public Associate getAssociate(int theId);

	public void deleteAssociate(int theId);

}
