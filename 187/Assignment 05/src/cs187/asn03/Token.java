package cs187.asn03;

/**
 * A token to be sent around a token ring. 
 */
public class Token {
	// The message contained in the token:
	private Message message;
	// Indicates if the token was received by a destination workstation:
	private boolean received;
	
	/**
	 * Creates a new Token object.
	 */
	public Token() {
		message  = null;
		received = false;
	}
	
	/**
	 * Returns the message in the token.
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * Sets the message in the token.
	 */
	public void setMessage(Message m) {
		message = m;
	}

	/**
	 * Sets the token as being received.
	 */
	public void setReceived(boolean received) {
		this.received = received;
	}

	/**
	 * Returns true if the token was received. 
	 */
	public boolean wasReceived() {
		return received;
	}
	
	/**
	 * Resets the token to contain no messages and not received.
	 */
	public void reset() {
		message  = null;
		received = false;
	}
}
