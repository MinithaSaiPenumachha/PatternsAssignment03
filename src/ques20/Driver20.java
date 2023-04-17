/**
 * 
 */
package ques20;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Driver20 {
	public static void main(String[] args) {
		Thread a1 = new Thread(new MyRunnable());
		Thread a2 = new Thread(new MyRunnable());
		System.out.println("a1: " + a1.getState()); 
		System.out.println("a2: " + a2.getState()); 
		a1.start();
		a2.start();
		System.out.println("a1: " + a1.getState()); 
		System.out.println("a2: " + a2.getState()); 
		Thread.yield();
		System.out.println("a1: " + a1.getState()); 
		System.out.println("a2: " + a2.getState()); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("a1: " + a1.getState()); 
		System.out.println("a2: " + a2.getState()); 
		a1.interrupt();
		try {
			a1.join();
			a2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("a1: " + a1.getState()); 
		System.out.println("a2: " + a2.getState());
	}

}
class MyRunnable implements Runnable {
@Override
public void run() {
	synchronized (this) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}

}
