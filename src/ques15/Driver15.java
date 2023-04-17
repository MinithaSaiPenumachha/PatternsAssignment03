/**
 * 
 */
package ques15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Driver15 {

    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(1, "Surya");
        h.put(2, "sai");
        h.put(3, "Sunny");
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1, "Tarun");
        m.put(2, "Shalini");
        m.put(3, "Reethi");
        System.out.println("Hash:");
        for (Map.Entry<Integer, String> entry : h.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Hash:");
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
