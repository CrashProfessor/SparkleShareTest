
public class Question4 {
	
	public static void main(String[] args) {
	
		Counter c = new Counter();

//  Code Sequence A, 
		
	c.increment();
	c.increment();
	System.out.println(c);
	System.out.println(c.getValue ());
	


//	Code Sequence B

	/*	
	Counter c = new Counter();
	
	Runnable r = new Increase(c, 3);
	
	Thread t = new Thread(r);

	c.increment();
	t.start();

	System.out.println(c);


	Code Sequence C
	Counter c = new Counter();
	Runnable r = new Increase(c, 3);
	Thread t = new Thread(r);
	t.start();
	c.increment();
	t.join();
	System.out.println(c);
*/
	}
}