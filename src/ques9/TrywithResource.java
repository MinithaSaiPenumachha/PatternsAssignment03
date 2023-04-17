/**
 * 
 */
package ques9;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

/**
 * @author Minitha Sai Penumachha
 *
 */

	public class TrywithResource {

		/**
		 * @param args
		 */
		
		public static int name(int n) {
			int b = 8;
			return b/0;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Scanner scn  = new Scanner(System.in)) {
				    // Execute code that uses the resources
				System.out.println("Enter a number");
				int p = scn.nextInt();
				System.out.println(name(p));

				} catch (ArithmeticException e) {
				    System.out.println("Found exception"+e);
				}

		}

	}


