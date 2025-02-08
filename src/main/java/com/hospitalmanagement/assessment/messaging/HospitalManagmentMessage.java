/**
 * 
 */
package com.hospitalmanagement.assessment.messaging;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author prajna
 * 
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalManagmentMessage {
	/**
	 * 
	 * This class is used by the applciation to pass the In-memory queue.
	 */

	private Long groupId;
	private Long parentId;
	private String operation;
	private LocalDateTime timestamp;

	public HospitalManagmentMessage(Long newId, Long parentGroupId, String operationType, LocalDateTime now) {
		this.groupId = newId;
		this.operation = operationType;
		this.timestamp = now;
		this.parentId = parentGroupId;
	}

	/**
	 * @return the groupId
	 */
	public Long getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the parentId
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * @return the timestamp
	 */
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
