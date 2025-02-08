package com.hospitalmanagement.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author prajna
 *
 */

@SpringBootApplication
@EnableScheduling
public class HospitalityApplicationAssessment {

	/**
	 * 
	 * @param args
	 * 
	 *             This is the Intial Point of the execution of the applciation.
	 * 
	 */

	public static void main(String[] args) {
		SpringApplication.run(HospitalityApplicationAssessment.class, args);
	}

}
