/**
 * 
 */
package com.hospitalmanagement.assessment.messageproducer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.hospitalmanagement.assessment.constants.CommonConstants;
import com.hospitalmanagement.assessment.messaging.HospitalManagmentMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author prajna
 * 
 *
 */
@Component
@Slf4j
public class MessageProducer {

	/**
	 *  This class is used to produce the messages whenever there is a user
	 *  activity to create or delete
	 */
	
	private BlockingQueue<HospitalManagmentMessage> messageQueue = new LinkedBlockingDeque<>();
	private static final Logger logger = (Logger) LoggerFactory.getLogger(MessageProducer.class);
	
	public MessageProducer() {
        this.messageQueue = new LinkedBlockingDeque<>();
    }

	
	/**
	 * 
	 * @param message
	 * 
	 * This method is used to send messages on queue.
	 * 
	 */
	public void sendMessage(HospitalManagmentMessage message) {
		try {
			messageQueue.put(message);
			logger.info(CommonConstants.MESSAGE_ADDED_TO_QUEU, message);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			logger.error(CommonConstants.MESSAGE_SENDING_FAILED, e.getMessage());
		}
	}
	/**
	 * 
	 * @return returns queue
	 */
	public BlockingQueue<HospitalManagmentMessage> getQueue() {
		return messageQueue;
	}

}
