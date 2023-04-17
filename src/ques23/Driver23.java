/**
 * 
 */
package ques23;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Driver23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableClass o = new ImmutableClass("Hello", 10);
		System.out.println("Original object: " + o);

		// Create multiple threads to access the object concurrently
		Thread a1 = new Thread(new MyRunnable(o));
		Thread a2 = new Thread(new MyRunnable(o));
		a1.start();
		a2.start();
	}

	static class MyRunnable implements Runnable {
		private final ImmutableClass o;

		MyRunnable(ImmutableClass b) {
			this.o = b;
		}

		public void run() {
			System.out.println("Thread " + Thread.currentThread().getId() + " accessed object: " + o);
			System.out.println("Thread " + Thread.currentThread().getId() + " tried to modify object...");
			o.setValue(20); // Try to modify the immutable object
			System.out.println("Thread " + Thread.currentThread().getId() + " finished execution...");
		}
	}
}

final class ImmutableClass {
	private final String str;
	private final int value;

	public ImmutableClass(String str, int value) {
		this.str = str;
		this.value = value;
	}

	public String getStr() {
		return str;
	}

	public int getValue() {
		return value;
	}

	public ImmutableClass setValue(int newValue) {
		// Note: This method returns a new instance of the class with the updated value
		return new ImmutableClass(str, newValue);
	}

	public String toString() {
		return "str = " + str + ", value = " + value;
	}

	}


