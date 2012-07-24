import support.LLNode;
import ch06.lists.*;


public class ReverseList<T> extends RefUnsortedList<T> {

	public ReverseList() 
	{
		super ();
	}

	
	public void reverse ()
	{
		reverseIterative();

//		reverseRecursive(list);
	}
	
	public void reverseIterative()
	{
  
		if (size() < 2)
			return;

		LLNode<T> current = list;		
		LLNode<T> previous = null;
		while (current.getLink() != null)
		{
			LLNode<T> next = current.getLink();
			current.setLink(previous);
			previous = current;
			current = next;
		}
		
		current.setLink(previous);
		list = current;
		
	}
	
	
	public void reverseRecurse (LLNode<T> current)
	{
		if (size() < 2)
			return;
  
		LLNode<T> rest = current.getLink();
		current.setLink(previous);
		previous = current;
		if (current.getLink() == null)
		{
			reverseRecurse ( rest);
		}
		
		return;		
	}

}
