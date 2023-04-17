/**
 * 
 */
package ques19;

/**
 * @author Minitha Sai Penumachha
 *
 */

	public class Class2Driver extends Thread {
		public void run() {
			System.out.println("created from extending Thread");
			}

		public static void main(String args[]) {
			Class2Driver c = new Class2Driver();
			c.start();
			Class1 cr = new Class1();
			Thread t = new Thread(cr);
			t.start();

	}
}