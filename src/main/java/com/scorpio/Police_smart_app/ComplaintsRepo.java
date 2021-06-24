package com.scorpio.Police_smart_app;


import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scorpio.Police_smart_app.model.Complaints;


public interface ComplaintsRepo extends JpaRepository<Complaints,BigInteger>{


	
}
