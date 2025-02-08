/**
 * 
 */
package com.hospitalmanagement.assessment.constants;

/**
 * @author prajna
 *
 */
public class CommonConstants {
	/**
	 * This class is used to define all common constats used in the application
	 */

	// Operation types Constants
	public static final String CREATE_TYPE = "CREATE";
	public static final String DELETE_TYPE = "DELETE";

	// Error Messages or Information Messages
	public static final String SUCCESS_GROUP_CREATION = "Group Created successfully!";
	public static final String FAILED_GROUP_CREATION = "Group Creation Failed Due to an error, Please Try AGain after sometime";
	public static final String GROPUP_CREATION_INPROGRESS = " Processing the Creating Group ";
	public static final String SUCCESS_CANCELLATION = "Group removed successfully!";
	public static final String FAILED_CANCELLATION = "Removal of Group Failed Due to an error, Please Try AGain after sometime";
	public static final String REMOVAL_GROUP_INPROGRESS = " Processing the Removal of Group ";
	public static final String GROUP_NOT_FOUND = "Group Not Found!!";
	public static final String MESSAGE_SENDING_FAILED = " Failed to enque message: {}";
	public static final String MESSAGE_ADDED_TO_QUEU = "Message Added to Queue: {}";
	public static final String ERROR_IN_PROCESSING_MESSAGE = " Error Processing mesages: {}";

}
