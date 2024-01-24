package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	/*
	 * Ans: Only one extends keyword inheritance for regularClass
	  
	 * Ans: Regular class can inherit regular class And abstract Class by extends
	  keyword but regular class cannot inherit interface by extends keyword.
	  
	 * Ans: Only one inheritance (extends) are possible regularClass.
	 */

// public abstract void chemistry();	
// regular class can not have a abstract method	

	public void biology() { // This Implements method
		System.out.println(" This biology from ColumbiaUniversity Regular Class");
	}

	public ColumbiaUniversity() {

	}

	@Override
	public void anatomyLab() {
		System.out.println(" This anoatomyLab from medicalSchool abstract");
	}

	@Override
	public void hygiene() {
		System.out.println("This hygiene from medicalSchool abstract");
	}

}
