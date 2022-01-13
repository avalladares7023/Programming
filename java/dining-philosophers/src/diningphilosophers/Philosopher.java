package diningphilosophers;

public class Philosopher implements Runnable {
	// TODO Create variables
	private int id;
	private Chopstick leftChopstick;  // = new Chopstick(1);
	private Chopstick rightChopstick; // = new Chopstick(2);

	public Philosopher(int id, Chopstick leftChopstick, Chopstick rightChopstick) {
		// TODO Implement Constructor
		this.id = id;
		this.leftChopstick = leftChopstick;
		this.rightChopstick = rightChopstick;
	}

	@Override
	public void run() {
		while (true) {
			eat();
		}
	}

	public void eat() {
		// TODO Implement Method
		/* If the left and right chopstick are not in use, pick up chopsticks and outprint:
		 * “Philosopher X is eating” X being the id of the philosopher
		 * Then have the thread sleep for a random time between 0 and 3 secs (i.e. (int)(Math.random()*3000))
		 * Release the chopsticks
		 * Call think()
		 * This method must handle all exceptions (no throws declaration should be added)
		*/
		try {
			if(leftChopstick.inUse() && rightChopstick.inUse()) {
				leftChopstick.take();
				rightChopstick.take();
				System.out.println("Philosopher " + id + " is eating");
				
				Thread.sleep((int)(Math.random()*3000));
				leftChopstick.release();
				rightChopstick.release();
				think();
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void think() {
		// TODO Implement Method
		/* Outprint “Philosopher X is thinking” X being the id of the philosopher
		 * Then have the thread sleep for a random time between 0 and 3 secs (i.e. (int)(Math.random()*3000))
		 */
		System.out.println("Philosopher " + id + " is thinking");
		try {
			Thread.sleep((int)(Math.random()*3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
