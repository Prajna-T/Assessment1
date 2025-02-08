/**
 * 
 */
package com.hospitalmanagement.assessment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.assessment.constants.CommonConstants;
import com.hospitalmanagement.assessment.dto.HospitalManagementRequest;
import com.hospitalmanagement.assessment.entity.HospitalManagemntEntity;
import com.hospitalmanagement.assessment.service.HospitalManagementService;

import lombok.RequiredArgsConstructor;

/**
 * @author prajna
 *
 */

@RestController
@RequestMapping("api/v1/groups")
@RequiredArgsConstructor
public class HospitalManagementController {
	
	/**
	 * 
	 * This class is used to handle all the Requests of the User
	 */
	
	@Autowired
    private HospitalManagementService appointmentService;
	
	/**
	 * 
	 * @param appointment details
	 * @returns status of the Service
	 * 
	 * This method is implemented to invoke Booking an appointment
	 * 
	 */
    @PostMapping("/create")
    public ResponseEntity<HospitalManagemntEntity> createGroup(@RequestBody HospitalManagementRequest request) {
        return ResponseEntity.ok(appointmentService.createGroup(request));
    }
    
    /**
     * 
     * @param id appointment ID which needs to be cancelled
     * @return returns response body with status code
     * 
     * This method is implemented to invoke cancellation of the booked appointment using the booking ID
     * 
     */

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> removeGroup(@PathVariable Long id) {
    	appointmentService.deleteGroup(id);
    	Map<String, String> response = new HashMap<>();
    	response.put("message", CommonConstants.SUCCESS_CANCELLATION);
        return ResponseEntity.ok(response);
    }

}
