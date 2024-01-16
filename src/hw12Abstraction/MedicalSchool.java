package hw12Abstraction;

public abstract class MedicalSchool extends NursingSchool {

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
		System.out.println(" This is a non-abstract Method");
// public MedicalSchool() {
// Abstract Class Cannot have Constructor
	}
}
