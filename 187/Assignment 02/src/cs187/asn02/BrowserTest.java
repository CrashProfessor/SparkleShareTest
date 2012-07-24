package cs187.asn02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrowserTest {

	private static boolean PROMPT;
	
	private static void prompt() {
		if (PROMPT) {
			System.out.print("> ");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = null;
		
		if (args.length > 0) {
			try {
				in 	   = new Scanner(new File(args[0]));
				PROMPT = false;
			} catch (FileNotFoundException e) {
				System.err.println("Could not find file " + args[0]);
				System.exit(1);
			}
		}
		else {
			in 	   = new Scanner(System.in);
			PROMPT = true;
		}
		
		BrowserHistory bh = new BrowserHistory();
		
		System.out.println("Browser Test");
		prompt();		
		
		while (in.hasNext()) {
			String command = in.next();
			if (command.equals("w")) {
				Visit v = new Visit();
				bh.visit(v);
				System.out.println(v);
			}
			else if (command.equals("b")) {
				bh.back();
				System.out.println(bh.current());
			}
			else if (command.equals("f")) {
				bh.forward();
				System.out.println(bh.current());
			}
			else if (command.equals(".")) {
				break;
			}
			
			prompt();
		}
	}
	
}
