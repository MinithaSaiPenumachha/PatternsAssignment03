/**
 * 
 */
package ques17;

/**
 * @author Minitha Sai Penumachha
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Sobhareddy Pittu
 * Apr 16, 2023
 */
public class Driver17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		for(Integer o : l) {
			if (o == 3) {
				l.remove(Integer.valueOf(o)); 
			}
		}
        System.out.println(l);
		/* Fail-Safe Iterator example
		Map<Integer, Integer> m = new ConcurrentHashMap<>();
		map.put(1, 9);
		map.put(2, 8);
		map.put(3, 7);
		Iterator<Integer> mitr = map.keySet().iterator();
		while (mitr.hasNext()) {
			int k = mitr.next();
			if (k == 3) {
				map.put(4, 4); 
			}
		} 
           */
	}

}