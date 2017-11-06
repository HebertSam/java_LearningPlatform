package com.project.learningplatform.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class learnController{
	//Member variables go here

	public learnController(){

	}
	
	@RequestMapping("")
	public String index(){
		return "index";
	}
	@RequestMapping("/{param}")
	public String learning(@PathVariable("param") String course){
		if (course.equals("forms")){
			return "forms";
		} else if (course.equals("advanced")){
			return "advanced";
		} else {
			return "redirect:/";
		}
	}
}
