/**
 * 
 */
package ques21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Driver21 {

	public class Dog implements Serializable{

		private String name;
	    private int age;
	    private double price;

	   public Dog(String name, int age, double price) {
			super();
			this.name = name;
			this.age = age;
			this.price = price;
		}


		public void main1(String[] args) throws Exception {
	        Dog c = new Dog("Doe", 4, 5000.0);

	        // Serialization
	        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
	        out.writeObject(c);
	        out.close();

	        // Deserialization
	        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
	        Dog c2 = (Dog) in.readObject();
	        in.close();

	        System.out.println("Name: " + c2.name);
	        System.out.println("Age: " + c2.age);
	        System.out.println("Salary: " + c2.price);
	    }

}

}
