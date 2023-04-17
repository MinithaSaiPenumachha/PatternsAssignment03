/**
 * 
 */
package ques18;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Driver18 extends Thread {

	public void run() {
		System.out.println("Thread Started");
		
	}
		public static void main(String args[]) {
			Driver18 d = new Driver18();
			d.start();
			d.start();
		}

}
