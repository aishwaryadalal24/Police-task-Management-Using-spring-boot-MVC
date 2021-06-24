package com.scorpio.Police_smart_app.model;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaints{
     
	
	
	
	private static long  idc=0;
	
	
	public Complaints() {
			
		}
	
	public void dbcon() {
		
		try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/policerecords", "root","Kalpana@24");
		String query="select count(*) from Complaints";
		Statement st=con.createStatement();
		ResultSet rs;
	    rs=st.executeQuery(query);
	    rs.next();
	    idc = rs.getInt(1);
	    
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
    @Id
	public long id;
	private String cname;
	private String caddress;
	private String pincode;
	private String cdate;
	private String mobile;
	private String ctype;
	private String criminal;
	private String description;
	private boolean issolved;
	private String sdate;
	
	public Complaints(String cname,String caddress,String pincode,String cdate,String mobile, String ctype, String criminal, String description,boolean issolved, String sdate){
		super();
		
		this.cname=cname;
		this.caddress=caddress;
		this.pincode=pincode;
		this.cdate=cdate;
		this.mobile=mobile;
		this.ctype=ctype;
		this.criminal=criminal;
		this.description=description;
		this.issolved=false;
		this.sdate=sdate;
		
	}
	
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		idc++;
		this.id = idc;
	}



	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getCriminal() {
		return criminal;
	}
	public void setCriminal(String criminal) {
		this.criminal = criminal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIssolved() {
		return issolved;
	}
	public void setIssolved(boolean issolved) {
		this.issolved = issolved;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
	
	
}
