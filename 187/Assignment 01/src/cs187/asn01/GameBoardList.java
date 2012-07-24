package cs187.asn01;

public class GameBoardList implements GameBoard {

	// Records guesses.
	private ListNode gword;
	
	// The word to guess.
	private String   word;
	
	// The HangMan object.
	private HangMan  hm;
	
	public GameBoardList(String guessWord) {
		word  = guessWord;
		gword = null;
		hm    = new HangMan();
		
		// TODO: initialize the gword list.
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
		// TODO
		return 0;
	}

	/**
	 * Returns true if this game board is in a winning state, that
	 * is, there are no more underscores in the gword. 
	 */
	public boolean inWinningState() {
		// TODO
		return false;
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
