/**
 * 
 */
package com.hospitalmanagement.assessment.messagelisteners;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hospitalmanagement.assessment.constants.CommonConstants;
import com.hospitalmanagement.assessment.messageproducer.MessageProducer;
import com.hospitalmanagement.assessment.messaging.HospitalManagmentMessage;

import lombok.extern.slf4j.Slf4j;

/**
 * @author prajna
 * 
 *
 */
@Component
@Slf4j
public class DeleteMessageListeners {

	/**
	 * This class is used to process the messages during delete group service
	 */

	private static MessageProducer messageProducer = null;
	private static final Logger logger = (Logger) LoggerFactory.getLogger(MessageProducer.class);

	@Autowired
	public void DeleteGroupListeners(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;

	}

	/**
	 * 
	 * This method helps in processing the Messages when removing a Group. Scheduler
	 * is scheduled to run evey 10 sec instead of manually running this thread.
	 * 
	 */
	@Scheduled(fixedDelay = 10000)
	public void processMessage() {
		try {
			HospitalManagmentMessage message = messageProducer.getQueue().poll();
			if (message != null && CommonConstants.DELETE_TYPE.equals(message.getOperation())) {
				logger.info(CommonConstants.REMOVAL_GROUP_INPROGRESS);
			}
		} catch (Exception e) {
			logger.error(CommonConstants.ERROR_IN_PROCESSING_MESSAGE, e.getMessage());
		}
	}

}
