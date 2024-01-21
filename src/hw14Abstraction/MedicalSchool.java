package hw14Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	/*
	 * Ans: Only one inherit abstract class by extends keyword ,
	 * 
	 * Ans: yes, abstract class inherit another abstract class and regular class,
	 * but cannot inherit Interface
	 * 
	 * Ans: Only one inheritance is possible in an abstract class
	 */
	public abstract void anatomyLab();

	public void biochemistry() {
		System.out.println(" This is biochemistry from MedicalSchool abstract Class");
// public MedicalSchool() {
// Abstract Class Cannot have Constructor
	}
	/*
	 * Ans: Only one Inherit abstract Class by extends keyword
	 * 
	 * Ans: Yes abstract Class inherit another abstract Class and regular class for
	 * extends keyword but abstract Class cannot inherit a regular class or abstract
	 * Class by Implements keyword, however abstract class can inherit more than one
	 * interface.
	 * 
	 * Ans: Only one inheritance are possible in abstract class
	 * 
	 */

}
