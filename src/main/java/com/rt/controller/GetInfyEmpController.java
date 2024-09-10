package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.service.EmpService;

@Controller
public class GetInfyEmpController {
	
	@Autowired
	private EmpService empService;
	
	
	@RequestMapping(value= "/home",method = RequestMethod.GET)
	public String showHome() {
		/**
		 * since this is a small application no need to communicate with service & dao layer
		 * 
		 * controller itself returning view name.
		 */
		return "home";
	}
	
	
	@GetMapping("/getAll")
	public String ShowAllInfyEmp1(Model model) {
		model.addAttribute("empDetails", empService.getAllEmpDetails());
		System.out.println(empService.getAllEmpDetails().toString());
		return "result";
		
	}
	
	@GetMapping("/delete")
	public String deleteByEmpId(@RequestParam("id") String eid) {
		empService.deleteEmpId(Integer.valueOf(eid));
		return "redirect:/getAll";
	}
	
	
	
}
