import ch05.queues.*;


/*
Question 3 (10 Points): Write a segment of code (application level) to perform each of the following operations. ÊAssume myQueue is an object of the class ArrayUnbndQueue. ÊYou may call any of the public methods. ÊYou may also declare additional queue objects.

1.Set secondElement to the second element from the beginning of myQueue, leaving myQueue without its original two front elements.
2.Set rear equal to the rear element in myQueue, leaving myQueue empty.
3.Set rear equal to the rear element in myQueue, leaving myQueue unchanged.
4.Print out the contents of myQueue, leaving myQueue unchanged.
*/

public class Question3 {
	
	public static void main(String[] args) {


	String element1 = "1";
	String element2 = "2";
	String element3 = "3";
	String element4 = "4";
	String element5 = "5";
	
	
	ArrayUnbndQueue<String> queue = new ArrayUnbndQueue<String> (10);
	
	queue.enqueue(element1);
	queue.enqueue(element2);
	queue.enqueue(element3);
	queue.enqueue(element4);
	queue.enqueue(element5);
	
//1.Set secondElement to the second element from the beginning of myQueue, leaving myQueue without its original two front elements.

	String firstElement = queue.dequeue ();
	String secondElement = queue.dequeue ();
	
	System.out.println("2nd Element is " + secondElement);

//2.Set rear equal to the rear element in myQueue, leaving myQueue empty.

	String rearElement = null;
	while (!queue.isEmpty()){
		rearElement = queue.dequeue ();
	}

	System.out.println("Rear Element is " + rearElement);
	
//3.Set rear equal to the rear element in myQueue, leaving myQueue unchanged.
	
	queue.enqueue(element1);
	queue.enqueue(element2);
	queue.enqueue(element3);
	queue.enqueue(element4);
	queue.enqueue(element5);
	
	ArrayUnbndQueue<String> tempQueue = new ArrayUnbndQueue<String> (10);
	
	while (!queue.isEmpty()){
		rearElement = queue.dequeue ();
		tempQueue.enqueue(rearElement);
	}
	
	while (!tempQueue.isEmpty ()){
		queue.enqueue(tempQueue.dequeue());
	}
	
	System.out.println("Rear Element is " + rearElement);

	System.out.println("Queue is now...");
	while (!queue.isEmpty ()){
		System.out.println(queue.dequeue());		
	}
		
//4.Print out the contents of myQueue, leaving myQueue unchanged.

	queue.enqueue(element1);
	queue.enqueue(element2);
	queue.enqueue(element3);
	queue.enqueue(element4);
	queue.enqueue(element5);

	System.out.println("Printing Q");		

	String tmpElement = null;
	while (!queue.isEmpty()){
		tmpElement = queue.dequeue();
		tempQueue.enqueue(tmpElement);
		System.out.println(tmpElement);		
	}
	
	while (!tempQueue.isEmpty ()){
		queue.enqueue(tempQueue.dequeue());
	}
	
	
	}
		
}
