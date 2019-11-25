package statePattern;

/**
 * 
 * @author brentable
 *
 */
public class DeliveredState implements State {
private Package pkg;
	
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * Set the constructor for use in Package class
	 */
	
	public void displayStatus() {
		System.out.println("Your requested item has been delivered!");
	}
	
	public void displayETA() {
		System.out.println("Your package has been delivered!");
	}
	/**
	 * Displays this methods status and estimated time of arrival when called
	 */
}
