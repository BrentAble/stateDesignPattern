package statePattern;
/**
 * 
 * @author brentable
 *
 */

public class OrderedState implements State {
	private Package pkg;
	
	public OrderedState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * Set the constructor for use in Package class
	 */
	
	public void displayStatus() {
		System.out.println("Your requested item has been ordered!");
	}
	
	public void displayETA() {
		System.out.println("Your package will be in transit next two buisness days!");
	}
	/**
	 * Displays this methods status and estimated time of arrival when called
	 */
}
