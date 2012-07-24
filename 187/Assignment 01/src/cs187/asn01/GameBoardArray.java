package cs187.asn01;

/**
 * The Array implementation of the GameBoard interface.
 */
public class GameBoardArray implements GameBoard {

	// Records guesses.
	private char[] 	gword;
	
	// The word to guess.
	private String 	word;
	
	// The HangMan object.
	private HangMan hm;
	
	// Constructs a GameBoardArray object.
	public GameBoardArray(String guessWord) {
		word  = guessWord;
		gword = new char[word.length()];
		hm    = new HangMan();
		
		// Initialize guess word with '_'
		for (int i = 0; i < gword.length; i++) {
			gword[i] = '_';
		}
	}
	
	/**
	 * Determines if the guess character is in the word to guess.
	 * It also updates the gword to reflect a correct guess.	 
	 * This method returns 1 if its a correct guess, 2 if it was
	 * already guessed, and 3 for an incorrect guess.
	 * 
	 * HINT (1): To determine if the guess is in the word you should
	 *           use the indexOf() String method.
	 */
	public int makeGuess(char guess) {
		String myGuess;
		int status = 0;
		// make guess = myGuess
		if word.indexOf(myGuess)
		{
			return > -1
				gword[word.indexOf(myGuess)] = myGuess;
				status = 1;	
		}
		return status;
	}

	/**
	 * Returns true if this game board is in a winning state, that
	 * is, there are no more underscores in the gword. 
	 */
	public boolean inWinningState() {
		for (int i = 0; i<=gword.length-1; i++ )
			if gword[i]
			{
				return false;
				else return true;
			}
	}
	/**
	 * Returns true if this game is in a losing state, that is,
	 * the hangman isHung() method returns true.
	 */
	public boolean inLosingState() {
		return hm.isHung();
	}
	
	/**
	 * Returns a string representation of the state of this
	 * game board array. This should be in the form shown in
	 * the assignment documentation.
	 */
	public String toString() {
		return null;
	}

}
