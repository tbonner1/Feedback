package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.FeedbackRepository;
import com.hcl.model.Feedback;

@Service 
@Transactional
public class ServiceImp implements ServiceInterface
{
	@Autowired
	private FeedbackRepository repo;
	
	@Override
	public Feedback addFeedback(Feedback fb) 
	{
		return repo.save(fb);
	}
}
