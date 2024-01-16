package hw12Abstraction;

public interface University extends College, Hospital {

	/*
	 * Ans: only one keyword (extends) are used inheritance in Interface
	 * 
	 * Ans: yes, Interface inherit other Interface by extends keyword but Interface
	 * can not inherit regular class or abstract class.
	 * 
	 * Ans: An Interface inherit more than one Interface (separated by comma)
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	public void gymnasiu();

	public static void library() {

	}

// public University() {}
// Interfaces can not have a Constructor 

}
