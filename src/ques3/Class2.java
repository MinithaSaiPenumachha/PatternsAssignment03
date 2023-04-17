/**
 * 
 */
package ques3;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Class2 extends Class1{

	@Override
    public Class2 reproduce() {
		System.out.println("Subclass");
        return new Class2();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class2 obj = new Class2();
		Class1 obj1 = obj.reproduce();
		System.out.println(obj1.getClass());
	}

}
