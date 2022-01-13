package diningphilosophers;

import java.util.ArrayList;

public class DiningPhilosophers {
	public static void main(String[] args) throws Exception {
		// TODO Implement
		/*5 Chopsticks must be added to an ArrayList of chopsticks
		 * 5 Philosophers must be initialize (setting the id, and the right and left chopsticks)
		 * Then a thread must be created for each philosopher and started.
		*/
		ArrayList<Chopstick> chopsticks = new ArrayList<Chopstick>();
		for(int i = 1; i <= 5; i++) {
			chopsticks.add(new Chopstick(i));
		}
		
		Philosopher p1 = new Philosopher(1, chopsticks.get(0), chopsticks.get(4));
		Philosopher p2 = new Philosopher(2, chopsticks.get(1), chopsticks.get(0));
		Philosopher p3 = new Philosopher(3, chopsticks.get(2), chopsticks.get(1));
		Philosopher p4 = new Philosopher(4, chopsticks.get(3), chopsticks.get(2));
		Philosopher p5 = new Philosopher(5, chopsticks.get(4), chopsticks.get(3));
		
		Thread s1 = new Thread(p1);
		Thread s2 = new Thread(p2);
		Thread s3 = new Thread(p3);
		Thread s4 = new Thread(p4);
		Thread s5 = new Thread(p5);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	}
}