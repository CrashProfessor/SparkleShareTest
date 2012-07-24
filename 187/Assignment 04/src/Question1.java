import ch05.queues.*;

public class Question1 {

	public static void main(String[] args) {

	
	String element1 = "1";
	String element2 = "0";
	String element3 = "4";
	
	ArrayBndQueue<String> queue = new ArrayBndQueue<String> (10);
	
	queue.enqueue(element2);
	queue.enqueue(element1);
	queue.enqueue(element1 + " " + element3 + " Add");
	element2 = queue.dequeue();
	queue.enqueue(element3 + " " + element3 + " Multiply");
	queue.enqueue(element2);
	queue.enqueue("3");
	element1 = queue.dequeue();
	
	System.out.println("Code Segment B");

	System.out.println(element1 + " " + element2 + " " + element3);
	
	while (!queue.isEmpty()) {
		element1 = queue.dequeue();
		System.out.println(element1);
	}

	System.out.println("Code Segment B");

	element1 = "4";
	element3 = "0";
	element2 = element1 + " " + "1" + " Plus";
	queue.enqueue(element2);
	queue.enqueue(element2 + " " + "1" + " Plus");
	queue.enqueue(element1);
	element2 = queue.dequeue();
	element1 = element2 + " " + "1" + " Plus";
	queue.enqueue(element1);
	queue.enqueue(element3);
	while (!queue.isEmpty()) {
		element1 = queue.dequeue();
		System.out.println(element1);
	}
	System.out.println(element1 + " " + element2 + " " + element3);

	
	
	}
	

}
