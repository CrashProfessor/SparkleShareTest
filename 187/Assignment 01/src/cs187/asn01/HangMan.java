package cs187.asn01;

/**
 * A class to represent the hangman sideways "image". 
 */
public class HangMan {

	// The ending state of failed attempts. 
	private int    hungstate;
	
	// The hangman string version of the image.
	private String image;
	
	// The hangman image as an array of characters.
	private char[] hangman;
	
	// The state of failed attempts.
	private int    state;
	
	/**
	 * Creates a new HangMan object.
	 */
	public HangMan() {
		image     = "]---o-|-<";
		hangman   = image.toCharArray();
		hungstate = hangman.length-1;
		state     = 0;
	}
	
	/**
	 * Returns the "image" of the next failed attempt.
	 */
	public String next() {			
		String pic = "";
		
		for (int i = 0; i < hangman.length && i <= state; i++) {
			pic += hangman[i];
		}
		
		if (state != hangman.length-1) {
			state++;
		}
		
		return pic;
	}
	
	/**
	 * Returns true if this HangMan object is in the hung state.
	 */
	public boolean isHung() {
		return state == hungstate;
	}
	
}
