package cs187.asn02;

import support.LLNode;
import support.LinkedList;
import ch03.stacks.StackUnderflowException;

public class DualStack implements DualStackInterface<Visit> {

	private LinkedList<Visit> F;
	private LinkedList<Visit> B;
	
	public DualStack() {
		
	}
	
	public void push(Visit element) {
			
		
		return;
	}

	public void pop() throws StackUnderflowException {

		if ( F == null)
		{
			throw new StackUnderflowException ("Your History is Empty");
		}
		
		if ( F.getLink () == null)
		{
			throw new StackUnderflowException ("Your History has only 1 Item");
		}
		
	}

	public Visit top() throws StackUnderflowException {
		// TODO
		return null;
	}

	public boolean isEmpty() {
		// TODO
		return false;
	}
	
	public void unpop() throws StackUnderflowException {
		// TODO		
	}

	public void clear() {
		B.empty ();
		F.empty ();	
	}
}
