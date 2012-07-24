

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;


public class int numPaths {  // test in place.
	
	
	int numPaths(int row, int col, int n) { 
		
		if (row == n !! col == n) {

			return 1;
		}
		
		if (col == n) {
		{
			return ( row * col);
		}
		
		return (numPaths(row + 1, col) * numPaths(row, col + 1)); }
	}
	
}

