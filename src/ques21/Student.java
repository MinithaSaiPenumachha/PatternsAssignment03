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

public class Student implements Serializable{

	private String name;
    private int age;
    private double salary;

   public Student(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public static void main(String[] args) throws Exception {
        Student c = new Student("Mini", 22, 5000.0);

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.ser"));
        out.writeObject(c);
        out.close();

        // Deserialization
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("Student.ser"));
        Student s = (Student) i.readObject();
        i.close();

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Salary: " + s.salary);
    }

}