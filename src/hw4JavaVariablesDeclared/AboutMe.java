package hw4JavaVariablesDeclared;

public class AboutMe {

	public String myName; // variable declared.
	public byte myAge;
	public short myMonthlySalary;
	public int myHomeAddress;
	public long myYearlySalary;
	public float myHeight;
	public double myDaughterGPA;
	public char myGender;
	public boolean iAmUSCitizen;

	public AboutMe() {// This is a constructor declared.

		System.out.println("This is all about us:");

	}

	public void aboutMe() {// method implemented.

		System.out.println("\nMy Name: " + myName + "\nMy Age: " + myAge + "\nMy Monthly Salary: " + myMonthlySalary
				+ "\nMy Yearly Salary: " + myYearlySalary + "\nMy Height: " + myHeight + "\nMy Daughter GPA: "
				+ myDaughterGPA + "\nMy Gender: " + myGender + "  \nI Am US Citizen: " + iAmUSCitizen);

	}

}
