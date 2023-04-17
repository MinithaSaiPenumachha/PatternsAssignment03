/**
 * 
 */
package ques14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Driver14 {

	public static void main(String[] args) {
		
		List<String> l2 = new ArrayList<>();
		l2.add("Surya");
		l2.add("Shalini");
		l2.add("Devi");
		l2.add("Sai");
		List<String> s = Collections.synchronizedList(l2);
		synchronized (s) {
			System.out.println("Size of synchronized list is: " + s.size());
		}
		synchronized (s) {
			s.add("Tarun");
			s.add("Reethi");
		}
		synchronized (s) {
			System.out.println("Synchronized list is: " + s);
		}
	}

}
