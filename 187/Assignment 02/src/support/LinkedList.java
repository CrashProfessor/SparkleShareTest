package support;


public class LinkedList<T> {
	
	private LLNode<T> first;
	private LLNode<T> last;
	private int count;

	public LinkedList ()
	{
		first = null;
		last = null;
		count = 0;
	}
	
	public void empty ()
	{
		first = null;
		last = null;
		count = 0;
	}
	
	public boolean isEmpty ()
	{
		return ( first == null);
	}
	
	public int getCount ()
	{
		return count;
	}
	
	public void addTail (T element)
	{
		// Empty List
		
		if ( this.isEmpty ())
		{
			LLNode<T> first = new LLNode<T> ( element);
			first.setInfo( element);
			first.setLink( null);
			count = 1;
			last = first;
			return;
		}
		
		// Normal Case
		
		LLNode<T> node = new LLNode<T> ( element);
		node.setInfo( element);
		node.setLink( null);
		last.setLink( node);
		last = node;
		++count;
		return;

	}
	
	public LLNode<T> getTail ()
	{
		return last;
		
	}
	
	public LLNode<T> removeTail ()
	{
		if ( count == 0)
		{
			return null;
		}
		
		LLNode<T> node = first;

		if ( count == 1)
		{
			first = null;
			last = null;
			count = 0;
			return node;
		}
		
		LLNode<T> previous = null;
		while ( node.getLink () != null)
		{
			previous = node;
			node = node.getLink ();
		}

		previous.setLink( null);
		--count;
		
		return ( node);		
	}
}
