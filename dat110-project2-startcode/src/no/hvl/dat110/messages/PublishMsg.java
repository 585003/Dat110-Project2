package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required
	private String topicName;
	private String message;
	
	public PublishMsg (String user, String topicName, String message) {
		super(MessageType.PUBLISH, user);
		this.topicName = topicName;
		this.message = message;
	}@Override
	public String toString(){
		return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topicName=" + topicName + ", message=" + message + "]";
	}
	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getMessage() {
		return message;
	}
}
