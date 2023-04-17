/**
 * 
 */
package ques10;

import java.io.FileNotFoundException;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Class2 extends Class1 {

	public void Class() throws FileNotFoundException {
		System.out.println("This is in Class2");
        
    }
	public static void main(String args[]) {
		Class2 p = new Class2();
		try {
			p.Class();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}