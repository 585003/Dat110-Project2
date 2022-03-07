package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	
	// TODO: 
	// Implement object variables - a topic is required
	private String topicName;
	
	public CreateTopicMsg (String user, String topicName) {
		super(MessageType.CREATETOPIC, user);
		this.topicName = topicName;
	}
	
	@Override
	public String toString(){
		return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topicName=" + topicName + "]";
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	// Constructor, get/set-methods, and toString method
    // as described in the project text	
}
