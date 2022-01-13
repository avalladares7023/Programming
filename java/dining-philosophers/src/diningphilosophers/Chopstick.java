package diningphilosophers;

public class Chopstick{
	// TODO Create variables
	private int id;
	private boolean inUse;
	
	public Chopstick(int id){
		// TODO Implement Constructor
		this.id = id;
		inUse = false;
	}
	
	public synchronized void release() {
		// TODO  Implement 
		this.inUse = false;
		System.out.println("Chopstick " + id + " has been set down");
	}

	public synchronized void take() {
		// TODO  Implement 
		this.inUse = true;
		System.out.println("Chopstick " + id + " has been picked up");
	}

	public synchronized boolean inUse() {
		// TODO  Implement 
		return inUse;
	}
}
