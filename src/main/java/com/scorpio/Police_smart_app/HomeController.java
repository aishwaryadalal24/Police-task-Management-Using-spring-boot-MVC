package com.scorpio.Police_smart_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scorpio.Police_smart_app.model.Complaints;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String home(){
		return "home.jsp";
	}
	
	@RequestMapping("complaintportal")
	public String ComplaintPortal(){
		return "complaintportal.jsp";
	}
	
	@RequestMapping("permissionportal")
	public String PermissionPortal(){
		return "permissionportal.jsp";
	}
	
		
	@PostMapping("askPermission")
	public String askPermission(){
		return "permissionasked.jsp";
	}
	
	@RequestMapping("mypython")
	public String runpython(){
		try {
			
			Process p=Runtime.getRuntime().exec("py -3 C:\\Users\\Dell\\Documents\\SpringLab\\Police_smart_app\\src\\main\\webapp\\views\\pyj\\Plotly_recent.py");
			BufferedReader in=new BufferedReader(new InputStreamReader(p.getInputStream()));
						
		    System.out.println(in.readLine());
			
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		finally {
			System.out.println("jiiiii");
		}
		
		return "pyj/temp-plot.html";
	}
	
}
