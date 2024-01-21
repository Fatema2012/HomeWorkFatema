package hw10Abstraction;
/*
 * You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. MedicalSchool extends NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class? Can an Abstract Class inherit another Abstract Class or a regular class or interface by extends keyword? How many inheritances are possible in an Abstract Class? (use java comments for the above question) and use the keywords to answer my questions.
 */
public abstract class MedicalSchool extends NursingSchool {

	/*
	 * Ans: Only one extends keyword is used for the inheritance in abstract Class
	 * Ans: yes, abstract class inherit another abstract class and regular class,
	 * but cannot inherit Interface by extends keyword.
	 *Ans:  Only one inheritance are possible in an abstract Class by extends keyword.
	 */
	public abstract void anatomyLab();

	public void biochemistry() {
		System.out.println(" This is a non-abstract Method");
// public MedicalSchool() {
// Abstract Class Cannot have Constructor
	}
}
