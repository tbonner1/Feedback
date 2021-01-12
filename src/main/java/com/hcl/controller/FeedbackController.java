package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.hcl.model.Feedback;
import com.hcl.service.ServiceInterface;

@RestController
@RequestMapping
public class FeedbackController 
{
	@Autowired
	private ServiceInterface service;
	
	@GetMapping("/feedback")
	public ModelAndView addNewEmp()
	{
		ModelAndView mv = new ModelAndView("feedback");
		return mv;
	}
	
	@PostMapping("/feedback")
	public ModelAndView newEmp(@RequestParam String feedback, ModelMap model)
	{
		Feedback feed = new Feedback();
		feed.setFeedback(feedback);
		service.addFeedback(feed);
		ModelAndView mv = new ModelAndView("redirect:/thankyou");
		return mv;
	}
	
	
	@GetMapping("/thankyou")
	public ModelAndView thanks()
	{
		ModelAndView mv = new ModelAndView("thankyou");
		return mv;
	}
}
