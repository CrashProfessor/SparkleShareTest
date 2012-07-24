
public class ReverseListDriver {

	public static void main(String[] args) {


	String element1 = "1";
	String element2 = "2";
	String element3 = "3";
	String element4 = "4";
	String element5 = "5";

// Sorted
	
	ReverseList<String> sortedList = new ReverseList<String> ();

	sortedList.add(element1);
	sortedList.add(element2);
	sortedList.add(element3);
	sortedList.add(element4);
	sortedList.add(element5);
	
	System.out.println(sortedList.toString());
	
	sortedList.reverse ();
	
	System.out.println(sortedList.toString());

	
//	Unsorted
	
	ReverseList<String> unsortedList = new ReverseList<String> ();

	unsortedList.add(element3);
	unsortedList.add(element1);
	unsortedList.add(element5);
	unsortedList.add(element4);
	unsortedList.add(element2);
	
	System.out.println(unsortedList.toString());
	
	unsortedList.reverse ();	
	System.out.println(unsortedList.toString());

	unsortedList.reverse ();	
	System.out.println(unsortedList.toString());

	unsortedList.reverse ();	
	System.out.println(unsortedList.toString());

	}
	
}
