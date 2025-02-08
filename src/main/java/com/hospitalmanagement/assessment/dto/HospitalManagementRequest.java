/**
 * 
 */
package com.hospitalmanagement.assessment.dto;

import lombok.Data;

/**
 * @author prajna
 *
 */
@Data
public class HospitalManagementRequest {
	/**
	 * This class is to map the Request Details
	 */

	private Long parentGroupId;
	private String name;

	/**
	 * @return the parentGroupId
	 */
	public Long getParentGroupId() {
		return parentGroupId;
	}

	/**
	 * @param parentGroupId the parentGroupId to set
	 */
	public void setParentGroupId(Long parentGroupId) {
		this.parentGroupId = parentGroupId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
