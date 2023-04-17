/**
 * 
 */
package ques12;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Driver12 {

	public final int div() {
		return 10/5 ;
	}
	
	public static void main(String args[]) throws Throwable {
		final double n = 3;
		Driver12 t = new Driver12();
		try {
		System.out.println(t.div());
		t.finalize();
		double s1 = n/0;
		}
		catch(Exception e){
			System.out.println(" Exception is "+e);
		}
		finally {
			
			System.out.println("Finally Block Executed Successfully");
		}
		
	}
	
	
	

}