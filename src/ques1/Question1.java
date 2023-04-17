/**
 * 
 */
package ques1;

/**
 * @author Minitha Sai Penumachha
 *
 */
public class Question1<M> {
	
	 private M valv;

	    public M getValv() {
	        return valv;
	    }

	    public void setValue(M valv) {
	        this.valv = valv;
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1<String> p = new Question1<>();
		p.setValue("Minitha, Penumachha");
		String value = p.getValv();
		System.out.println(value);

	}

}

