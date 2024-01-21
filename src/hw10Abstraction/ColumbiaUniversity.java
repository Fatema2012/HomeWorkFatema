package hw10Abstraction;
/*
 * Step 07: You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. ColumbiaUniversity extends MedicalSchool. how many keywords are used for the inheritance in Java for a regular Class? Can a regular Class inherit another Abstract Class or a regular class or interface by extends keyword? How many inheritances are possible by a regular Class? (use java comments for the above question). Use the keywords to answer my questions. You don't need to execute anything as the main method is absent. A GitHub link is necessary to paste.


 */
public class ColumbiaUniversity  extends MedicalSchool { // cannot extend medicalSchool

	/*
	 * Ans: Only one
	 * 
	 * Regular class can inherit regular class but cannot inherit abstract class and
	 * Interface
	 * 
	 * Only one inheritance
	 */

// public abstract void chemistry();	
// regular class can not have a abstract method	

	public void biology() {
		System.out.println("biology is an implemented  method");
	}

	public ColumbiaUniversity() {

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}
