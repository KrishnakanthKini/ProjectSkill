package com.example.demo.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.entity.Skill;
import com.example.demo.repository.SkillRepository;

public class SkillServiceImpl implements SkillService {
	
	@Autowired
	private SkillRepository skillRepository;

	@Override
	public List<Skill> getSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSkill(Skill theSkill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Skill getSkill(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSkill(int theId) {
		// TODO Auto-generated method stub
		
	}

	
}
