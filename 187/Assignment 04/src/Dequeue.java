
import ch05.queues.ArrayUnbndQueue;
import ch05.queues.QueueUnderflowException;

public class Dequeue<T> extends ArrayUnbndQueue<T> {

	public Dequeue() 
	{
	    super();
	}

	public Dequeue (int origCap) 
	{
	    super(origCap);
	}

	private void copyOn (T Element)
	{
		//Create a new Array of same size as the old 1 but add our new element at the front.

		T[] copyArray = (T[]) new Object[queue.length];
		
		copyArray[0] = Element;
		
		// copy the contents of 1 to N-1, we can come back and fix this up to minimize the cc length
				
		for (int i = 1; i < numElements; ++i)
		{
			copyArray[i] = queue[i-1];
		}
		
		// replace array
		    
		queue = copyArray;
	}

	public void insertFront(T element) 
	{
	    if (numElements == queue.length) 
	        super.enlarge();
	    
	    numElements = numElements + 1;

    	if (Math.abs( front - rear) > 1)
		{
	    	
	    	queue[front] = element;
		    front = (front + 1) % queue.length;
		}
	    else
	    {
	    	copyOn ( element);
	    }

	}
	

	public T removeRear()
	// Throws QueueUnderflowException if this queue is empty;
	{       
		if (isEmpty())
	      throw new QueueUnderflowException("RemoveRear attempted on empty queue.");
	    else
	    {
	      T toReturn = queue[rear];
	      queue[rear] = null;
	      rear = (rear - 1) % queue.length;
	      numElements = numElements - 1;
	      return toReturn;
	    }
	  }

}
