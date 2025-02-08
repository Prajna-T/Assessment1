# Assessment1 - Hospital management System

## Overview
This application is designed to  manage hospital operations efficiently. In this vesrion, the system is focussed on management of Grops within the Hospital. Whenevr a Group is created or Deleted, the system uses JMS to notify other components or services about the changes. 

## Features
 - REST APIs for Group Creation and deletion
 - In-memory storage
 - Error Handlinga nd Logging
 - No Database  configurations

## Technologies Used
 - Java 17
 - Spring Boot 3
 - Spring JMS
 - ActiveMQ
 - Maven
   
## Prerequisites
- Java 17
- Maven
- ActiveMQ (for JMS messaging broker)

## Installation 
### Step-by-Step Guide
- Clone the repository
- Navigate to the Project directory
- Install dependancies using maven
- Run activeMQ
- Run the Application
- Access the application using http://localhost:8080

## Usage

### Create Group
   * Endpoint: POST /api/v1/groups/create
   * Request Body:
     {
    "name": "Shoulder",
    "parentGroupId": "Hospital A"
    }

### Delete Group 
   * End point: DELETE /api/v1/groups/{id}

## JMS Notification
Whenever a Group is created or deleted, the system will send a JMS message with the details of the Operation.

# License


# Contact
* **Email:** prajnatilakchandra@gmail.com
*  **GitHub:** gitHub.com/Prajna-T
