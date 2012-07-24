package cs187.asn03;

import ch06.lists.ListInterface;

/**
 * The interface for a token ring. 
 */
public interface TokenRingListInterface extends ListInterface<Workstation> {
	public void setClockwise();
	public void setCounterClockwise();
}
