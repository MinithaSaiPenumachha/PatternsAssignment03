/**
 * 
 */
package ques8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Try {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.print("Enter a number: ");
	            int num = scanner.nextInt();
	            System.out.println("You entered: " + num);
	        } finally {
	            scanner.close();
	        }
     }
}
