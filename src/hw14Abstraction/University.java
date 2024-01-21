package hw14Abstraction;

public interface University extends College, Hospital {

	/*
	 * Ans: only one keyword (extends) are used inheritance in Interface
	 * 
	 * Ans: yes, Interface inherit other Interface by extends keyword but Interface
	 * can not inherit regular class or abstract class.
	 * 
	 * Ans: An Interface inherit more than one Interface (separated by comma)
	 * 
	 * Ans:
	 * 
	 */

	public void classSize();

	public void playGround();

	public void teacher();

	public void gymnasium();

	public static void library() {
		System.out.println("This library feature from University Interface");

	}
//	----------------------------------------------------------------------

	/*
	 * Ans: An Interface can Inherit more than one Interface(Separated by comma) by
	 * extends keyword.
	 * 
	 * Ans: Yes Interface Inherit other Interface but Interface cannot inherit
	 * regular Class or Abstract class.
	 * 
	 * Ans: More than one Inheritance are possible for Interface.
	 * 
	 * Ans: University extends College, Hospital
	 * 
	 */

}
