package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required
	private String topicName;
	public UnsubscribeMsg (String user, String topicName) {
		super(MessageType.UNSUBSCRIBE, user);
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
