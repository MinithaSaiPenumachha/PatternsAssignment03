/**
 * 
 */
package ques27;

/**
 * @author Minitha Sai Penumachha
 *
 */

public class Cat { 

	private static Cat instance;

	private Cat() {}

	public static synchronized Cat getInstance() {
		if (instance == null) {
			System.out.println("instance of SingletonSyncDemo");
			instance = new Cat();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hii, Leo!");
	}

	public static void main(String[] args) {
		System.out.println("instance of SingletonSyncDemo");
		Cat c1 = Cat.getInstance();

		System.out.println("instance of SingletonSyncDemo again");
		Cat c2 = Cat.getInstance();

		System.out.println("instances equal? " + (c1 == c2));

		System.out.println("showMessage on cat1");
		c1.showMessage();

		System.out.println("showMessage on cat2");
		c1.showMessage();
	}

	}