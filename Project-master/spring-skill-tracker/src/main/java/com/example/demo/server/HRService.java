package com.example.demo.server;

import java.util.List;

import com.example.demo.entity.Associate;
import com.example.demo.entity.HR;

public interface HRService {
	
	public List<Associate> getAssociates();

	public void saveAssociate(Associate theAssociate);

	public Associate getAssociate(int theId);

	public void deleteAssociate(int theId);
	
	public void getAssociateBySkill(String Skill);
	
	public List<Associate> searchBy(String theName);
	
	
	
}
