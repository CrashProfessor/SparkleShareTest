package cs187.asn02;

public class BrowserHistory {

	// The browser history as a dual stack:
	private DualStackInterface<Visit> history;
	
	/**
	 * Creates the browser history object.
	 */
	public BrowserHistory() {
		history = new DualStack();
	}
	
	/**
	 * Adds a new Visit object to the history.
	 */
	public void visit(Visit v) {
		// TODO
	}
	
	/**
	 * Returns the current Visit object - the page we are
	 * currently viewing in the browser.
	 */
	public Visit current() {
		// TODO
		return null;
	}
	
	/**
	 * "Clicks" the back button on the browser.
	 */
	public void back() {
		// TODO		
	}
	
	/**
	 * "Clicks" the forward button on the browser.
	 */
	public void forward() {
		// TODO
	}
	
	/**
	 * Clears the browser's history.
	 */
	public void clear() {
		history.clear();
	}
	
}
