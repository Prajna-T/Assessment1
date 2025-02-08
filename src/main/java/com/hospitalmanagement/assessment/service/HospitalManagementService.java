/**
 * 
 */
package com.hospitalmanagement.assessment.service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.hospitalmanagement.assessment.constants.CommonConstants;
import com.hospitalmanagement.assessment.dto.HospitalManagementRequest;
import com.hospitalmanagement.assessment.entity.HospitalManagemntEntity;
import com.hospitalmanagement.assessment.exception.GroupNotFoundException;
import com.hospitalmanagement.assessment.messageproducer.MessageProducer;
import com.hospitalmanagement.assessment.messaging.HospitalManagmentMessage;

import lombok.RequiredArgsConstructor;

/**
 * @author prajna
 *
 */
@Service
public class HospitalManagementService {

	/**
	 * 
	 * This class is used to Write the logic of the applciation
	 */

	private final MessageProducer messageProducer = new MessageProducer();
	private final Map<Long, HospitalManagemntEntity> hospitalManagementStore = new ConcurrentHashMap<>();
	private final AtomicLong idGenerator = new AtomicLong(1);

	/**
	 * 
	 * @param request Data sent in teh Request by the user
	 * @returns Appointment details
	 * 
	 *          This method Books the appointment and Returns
	 * 
	 */
	public HospitalManagemntEntity createGroup(HospitalManagementRequest request) {
		Long newId = idGenerator.getAndIncrement();
		HospitalManagemntEntity groupEntity = new HospitalManagemntEntity();
		hospitalManagementStore.put(newId, groupEntity);

		HospitalManagmentMessage message = new HospitalManagmentMessage(newId, request.getParentGroupId(),
				CommonConstants.CREATE_TYPE, LocalDateTime.now());
		messageProducer.sendMessage(message);
		return groupEntity;
	}

	/**
	 * 
	 * @param id ID used to identify the Booking and remove it from the in-Memory
	 */
	public void deleteGroup(Long id) {
		if (!hospitalManagementStore.containsKey(id)) {
			throw new GroupNotFoundException(CommonConstants.GROUP_NOT_FOUND);
		}
		hospitalManagementStore.remove(id);
		HospitalManagmentMessage message = new HospitalManagmentMessage(id, null, CommonConstants.DELETE_TYPE,
				LocalDateTime.now());
		messageProducer.sendMessage(message);

	}

}
