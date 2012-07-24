package cs187.asn03;

import ch06.lists.ListInterface;
import ch06.lists.RefUnsortedList;

/**
 * A Workstation used in the network simulation. 
 */

public class Workstation {	
	// Workstation ID:
	private int id;

	// The list of messages to send.
	private ListInterface<Message> messages;
	
	/**
	 * Creates a new Workstation object. 
	 */
	public Workstation(int id, ListInterface<Message> messages) {
		this.id = id;
		this.messages = messages;
	}
	
	/**
	 * Creates a new Workstation object. 
	 */
	public Workstation(int id) {
		this(id, new RefUnsortedList<Message>());
	}
	
	/**
	 * Returns true if this workstation has messages to send. 
	 */
	public boolean hasMessages() {
		return messages.size() != 0;
	}
	
	public int getID (){
		return id;
	}
	
	/**
	 * Receives a message from the simulated network. 
	 */
	public void receive(Token t) {
	
		// Determine if token is empty
		Message message = t.getMessage();
		if ( message == null)
			return;
		
		// Process if we were the Sender (assume Sender != Receiver)
		if ( message.getSender() == id)
		{
			if (t.wasReceived() == true)
			{							
				System.out.printf("message %s acknowledged by sender %d from destination %d%n",
						message.toString(),
						message.getSender(),
						message.getReceiver());
			}else
			{
				System.out.printf("message %s dropped; destination not reachable%n",
						message.toString());
			}

			t.reset ();
			return;
		}
		
		// Given we are not the sender, check to see if this message is to be received by us

		if ( message.getReceiver() == id)
		{
			t.setReceived (true);
		
			System.out.printf("message %s received by %d; sent by %d%n",
					message.toString(),
					message.getReceiver(),
					message.getSender());
		}
		
		return;
	}
	
	/**
	 * Sends a message from the network by returning
	 * the next message to send. 
	 */
	public Message send() {
		if (messages.size() > 0) {
			messages.reset();
			Message m = messages.getNext();
			messages.remove(m);
			System.out.printf("message %s sent by %d; to be received by %d%n",
					m.toString(),
					m.getSender(),
					m.getReceiver());
			return m;
		}
		// Return null if we have no messages to send.
		return null;
	}
}
