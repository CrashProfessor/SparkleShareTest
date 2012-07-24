

public class DequeueDriver {
	
	public static void main(String[] args) {


	String element1 = "1";
	String element2 = "2";
	String element3 = "3";
	String element4 = "4";
	String element5 = "5";
	
	
	Dequeue<String> queue = new Dequeue<String> (10);

// Put in 5 take out 5. FIFO

	queue.enqueue(element1);
	queue.enqueue(element2);
	queue.enqueue(element3);
	queue.enqueue(element4);
	queue.enqueue(element5);

	System.out.println("Queue (FIFO) is now...");
	while (!queue.isEmpty ()){
		System.out.println(queue.dequeue());		
	}
		
// Put in 5 take out 5. LIFO
	
	queue.enqueue(element1);
	queue.enqueue(element2);
	queue.enqueue(element3);
	queue.enqueue(element4);
	queue.enqueue(element5);

	System.out.println("Queue (LIFO) is now...");
	while (!queue.isEmpty ()){
		System.out.println(queue.removeRear());		
	}

	
// Now let's mix it up
	
	queue.enqueue(element1);
	queue.enqueue(element2);
	queue.insertFront(element3);
	queue.insertFront(element4);

	System.out.println("Queue (2 Enq, 2 Insert, 1 Enq) is now...");
	while (!queue.isEmpty ()){
		System.out.println(queue.dequeue());		
	}
				
	
	}
}
