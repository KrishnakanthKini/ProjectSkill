package com.example.demo.server;

import java.util.List;

import com.example.demo.entity.Skill;


public interface SkillService {
	
	
	public List<Skill> getSkills();

	public void saveSkill(Skill theSkill);

	public Skill getSkill(int theId);

	public void deleteSkill(int theId);
	

}
