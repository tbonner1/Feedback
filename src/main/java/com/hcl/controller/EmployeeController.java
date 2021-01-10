package com.hcl.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hcl.dao.EmpRepository;
import com.hcl.model.Employee;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmpRepository repo;
	
	@PostMapping("/addemp")
	public String newEmp(Employee emp)
	{
		repo.save(emp);
		return ("redirect:/listemp");
	}
	
	@GetMapping("/addemp")
	public ModelAndView addNewEmp()
	{
		Employee e1 = new Employee();
		return new ModelAndView("newemp", "form", e1);
	}
	
	@GetMapping("/listemp")
	public ModelAndView listEmp(Employee emp)
	{
		List<Employee> allemps = (List<Employee>) repo.findAll();
		return new ModelAndView("emps", "employees", allemps);
	}
	
	@GetMapping("/editemp/{id}")
	public ModelAndView updateEmp(@PathVariable("id") long id)
	{
		ModelAndView mv;

		if(repo.findById(id).isPresent())
		{
			mv = new ModelAndView("edit");
			Employee e1 = repo.findById(id).get();
			mv.addObject("edit", e1);
		}
		else 
		{
			mv = new ModelAndView("editfail");
		}
		return mv;
	}
	
	@PostMapping("/editemp/{id}")
	public String editsaveEmp(@ModelAttribute("emp") Employee emp)
	{
		repo.save(emp);
		return ("redirect:/listemp");
	}
	
	@PostMapping("/editemp/editfail")
	public String editFail()
	{
		return ("redirect:/listemp");
	}
	
	
	@GetMapping("/deleteemp/{id}")
	public ModelAndView deleteEmp(@PathVariable("id") long id)
	{
		ModelAndView mv;

		if(repo.findById(id).isPresent())
		{
			mv = new ModelAndView("delete");
			Employee e1 = repo.findById(id).get();
			mv.addObject("delete", e1);
			
		}
		else 
		{
			mv = new ModelAndView("deletefail");
		}
		return mv;
	}
	
	@PostMapping("/deleteemp/delete")
	public String deletesEmp(@ModelAttribute("emp") Employee emp)
	{
		repo.delete(emp);
		return ("redirect:/listemp");
	}
	
	@PostMapping("/deleteemp/deletefail")
	public String deletesFail()
	{
		return ("redirect:/listemp");
	}
}
