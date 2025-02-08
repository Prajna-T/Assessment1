/**
 * 
 */
package com.hospitalmanagement.assessment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author prajna
 * 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalManagemntEntity {
	
	/**
	 * This is the Request parameters
	 */
	

	private Long id;
	private Long parentGroupId;
	private String name;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
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
