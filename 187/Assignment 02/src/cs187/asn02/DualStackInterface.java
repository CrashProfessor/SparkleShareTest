package cs187.asn02;

import ch03.stacks.StackUnderflowException;
import ch03.stacks.UnboundedStackInterface;

public interface DualStackInterface<T> extends UnboundedStackInterface<T> {
	public void unpop() throws StackUnderflowException;
	public void pop () throws StackUnderflowException;
	public void clear();  // Removes all the elements from the F stack.
}
