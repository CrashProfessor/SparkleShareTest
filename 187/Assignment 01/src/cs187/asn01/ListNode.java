package cs187.asn01;

/**
 * A list node class based on the LLStringNode class in the book.
 * You can compare the two by looking on page 106. 
 */
public class ListNode {
	
	// A reference to the next node.
	private ListNode link;
	
	// The value contained in this node.
	private char     info;
	
	/**
	 * Creates a new ListNode object.
	 */
	public ListNode() {
	}
	
	/**
	 * Returns the character stored in this node.
	 */
	public char getInfo() {
		return info;
	}
	
	/**
	 * Sets the character in this node.
	 */
	public void setInfo(char info) {
		this.info = info;
	}
	
	/**
	 * Sets the next link of this node.
	 */
	public void setLink(ListNode link) {
		this.link = link;
	}
	
	/**
	 * Returns the next link of this node.
	 */
	public ListNode getLink() {
		return link;
	}
	
}
