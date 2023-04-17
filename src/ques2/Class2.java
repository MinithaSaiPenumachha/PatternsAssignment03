/**
 * 
 */
package ques2;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Class2 extends Class1 {
	  
//	@Override
//	private void methodA() {
//		System.out.println("methodA in class A");
//	}

	@Override
	void car2() {
		System.out.println("methodB in class B");
	}

	@Override
	protected void car3() {
		System.out.println("methodC in class B");
	}

//	@Override
//	public void methodD() {
//		System.out.println("methodD in class B");
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 p = new Class2();
		p.car2();
		p.car3();
		p.car4();

	}

}