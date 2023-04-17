/**
 * 
 */
package ques26;

/**
 * @author Minitha Sai Penumachha
 *
 */

public class Driver26 {

		private static final Driver26 instance = new Driver26();

		private Driver26() {
			System.out.println("Creating a Student instance.");
		}

		public static Driver26 getInstance() {
			return instance;
		}

		public void showMessage() {
			System.out.println("This is a Student object.");
		}

		public static void main(String[] args) {
			Driver26 d1 = Driver26.getInstance();
			Driver26 d2 = Driver26.getInstance();

			System.out.println("d1 hash code: " + d1.hashCode());
			System.out.println("d2 hash code: " + d2.hashCode());

			d1.showMessage();
		}


}
