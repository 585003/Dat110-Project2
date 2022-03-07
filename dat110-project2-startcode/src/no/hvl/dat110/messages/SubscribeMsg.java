package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
	private String topicName;
	public SubscribeMsg (String user, String topicName) {
		super(MessageType.SUBSCRIBE, user);
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
