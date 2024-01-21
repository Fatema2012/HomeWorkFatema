package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

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
		System.out.println("This is biology from ColumbiaUniversity regular class ");
	}

	public ColumbiaUniversity() {

	}
	/*
	 * Ans: Only one
	 * 
	 * Ans: Regular class can inherit only one regular class or abstract class by
	 * extends keyword but regular class cannot inherit a regular class or abstract
	 * class by implements keyword, Regular Class can inherit more than one
	 * interface.
	 * 
	 * Ans: More than one Implements keyword.
	 * 
	 */

	@Override
	public void commonRoom() {
		System.out.println("This is commonRoom from Collage Interface  ");
	}

	@Override
	public void laboratory() {
		System.out.println("This laboratory from College Interface");

	}

	@Override
	public void languageClub() {
		System.out.println("This is language Club from College Interface");

	}

	@Override
	public void dorm() {
		System.out.println("This is dorm from College Interface");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is emergencyRoom from Hospital Interface");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is surgeryRoom from Hospital Interface");

	}

	@Override
	public void cafeteria() {
		System.out.println("This is cafeteria from Hospital Interface");

	}

	@Override
	public void morgue() {
		System.out.println("This is morgue from Hospital Interface");
	}

	@Override
	public void classSize() {
		System.out.println("This is classSize from University Interface");

	}

	@Override
	public void playGround() {
		System.out.println("This is playGround from University Interface");

	}

	@Override
	public void teacher() {
		System.out.println("This is teacher from University Interface");

	}

	@Override
	public void gymnasium() {
		System.out.println("This is gymnasium from University Interface");

	}

	@Override
	public void lawInfo() {
		System.out.println("This is lawInfo from LawSchool Interface");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("This is vocationalInfo from VocationalSchool Interface");

	}

	@Override
	public void anatomyLab() {
		System.out.println("This is anatomyLab from MedicalSchool abstract class");

	}

	@Override
	public void hygiene() {
		System.out.println("This is hygiene from NursingSchool abstract class");

	}

}
