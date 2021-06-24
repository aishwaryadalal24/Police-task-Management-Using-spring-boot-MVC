package com.scorpio.Police_smart_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.scorpio.Police_smart_app.model.Complaints;




@Controller
public class ComplaintsController {
     
	@Autowired
	ComplaintsRepo repo;
	
	
	@PostMapping("addComplaint")
	public String addComplaint(@ModelAttribute("Complaints") Complaints c){
		c.dbcon();
		c.setId(c.id);
	    c.id=c.getId();
		repo.save(c);
		return "compadded.jsp";
	}

	
}
