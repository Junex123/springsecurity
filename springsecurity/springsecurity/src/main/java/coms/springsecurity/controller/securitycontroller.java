package coms.springsecurity.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import coms.springsecurity.model.security;
import coms.springsecurity.repository.*;

@Controller
public class securitycontroller {
	@Autowired
	private securityrepos repos;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	// ************* Basic Crud Operations *******************
	
	// Create and Update
	@RequestMapping("/addEntry")
	public String addUpdateJournalEntry(security security) {
		
		// save or update journal entry in db
		repos.save(security);
		
		return "home.jsp";
		
	}
	
	// Get All Records
	@RequestMapping("/getAllEntries")
	public ModelAndView getAllJournalEntries() {
		ModelAndView mv = new ModelAndView();
		
		// Get All Entries list from db
		List<security> entries = repos.findAll();
		
		mv.addObject("entries",entries);
		mv.setViewName("getAllEntries.jsp");
		
		return mv;
	}
	
	@RequestMapping("/getEntry")
	public ModelAndView getJournalEntry(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		
		// Get a specific entry using id from db
		security journalEntry = repos.findById(id).orElse(new security());
		
		mv.addObject("entry", journalEntry);
		mv.setViewName("getEntry.jsp");
		
		return mv;
	}
	
	@RequestMapping("/deleteEntry")
	public String deleteJournalEntry(@RequestParam int id) {
		
	
		// Delete a specific entry using id from db
		repos.deleteById(id);
		
		return "home.jsp";
	}
}
