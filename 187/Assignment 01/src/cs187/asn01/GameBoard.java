package cs187.asn01;

public interface GameBoard {
	public int makeGuess(char guess);
	// Looks for the character in the gameboard. Returns the value 1
	// if correct guess, 2 if already guessed, and 3 if incorrect guess.

	public boolean inWinningState();
	// Returns true if the game is in the winning state.  

	public boolean inLosingState();
	// Returns true if the game is in a losing state.

	public String toString();
	// Returns a string representation of the gameboard. This includes
	// the letters guessed and not guessed and the hangman state.
}
