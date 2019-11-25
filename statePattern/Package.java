package statePattern;

public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	private String name = null;
	private State state;
	
	public Package(String contents) {
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
		this.name = contents;
	}
	
	public void order() {
		orderedState.displayStatus();
		orderedState.displayETA();
	}
	public void mail() {
		inTransitState.displayStatus();
		inTransitState.displayETA();
	}
	public void received() {
		deliveredState.displayStatus();
		deliveredState.displayETA();
	}
	/**
	 * call the methods from each class from the interface
	 * This shows each state of the package and its current status and time till delivery
	 */
	
	public void setState(State state) {
		this.state = state;
	}
	/**
	 * change the current state the system is in
	 */
	
	public String getString(String name) {
		return name;
	}
	/**
	 * returns the name of the system.
	 */
	
}
