package com.dah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dah.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercise Minutes : " + exercise.getMinutes());
		//return "redirect:addMoreMinutes.html";
		return "addMinutes";
	}

//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//
//		System.out.println("exercise Minutes : " + exercise.getMinutes() + " More");
//		return "addMinutes";
//	}


//	@RequestMapping(value = "/pd")
//	public String addMoreMinutes() {
//
//		//System.out.println("exercise Minutes : " + exercise.getMinutes() + " More");
//		return "ch1.pdf";
//	}

}
