/**
 * 
 */
package com.hospitalmanagement.assessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author prajna
 *
 */
@SuppressWarnings("serial")
public class GroupNotFoundException extends RuntimeException {
	/**
	 * This class is used to handle the Error when Group trying to delete is unavailable in the in-memory
	 * 
	 */
	
	
	public GroupNotFoundException(String groupNotFound) {
	}

	/**
	 * 
	 * @param message
	 * This method is used to capture error whne the Group Id is not found in memory.
	 * 
	 */
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void GroupNotFoundException (String message) {
		
	}

}
