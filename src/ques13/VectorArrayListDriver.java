/**
 * 
 */
package ques13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class VectorArrayListDriver {

	
    public static void main(String[] args) {
       
        List<String> l = new Vector<>();
        l.add("Sai");
        l.add("Surya");
        l.add("Tarun");
       
        List<String> list2 = new ArrayList<>();
        list2.add("Shalini");
        list2.add("Devi");
        list2.add("Sunny");
        
        for (String n : l) {
            System.out.println(n);
        }
        
        for (String n : l) {
            System.out.println(n);
        }
    }
}


