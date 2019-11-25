package statePattern;

/**
 * 
 * @author brentable
 *
 */
public class InTransitState implements State {
	private Package pkg;
	
	public InTransitState(Package pkg) {
		this.pkg = pkg;
	}
	/**
	 * Set the constructor for use in Package class
	 */
	
	public void displayStatus() {
		System.out.println("Your requested item has started its transit to you!");
	}
	
	public void displayETA() {
		System.out.println("Your package will be delivered to you in 3-5 buisness days!");
	}
	/**
	 * Displays this methods status and estimated time of arrival when called
	 */
}
