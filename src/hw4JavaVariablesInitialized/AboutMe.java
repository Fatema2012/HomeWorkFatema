package hw4JavaVariablesInitialized;

public class AboutMe {

	public int myAddress; // Variable declared here.

	public String myName = "Fatema Akter";// Variable initialized here.

	public byte myAge = 31;

	public short myHomeAddress = 12047;

	public int myBankBalance = 2000;

	public long myMonthlySalary = 90000000;

	public float myHeight = 3.4f;

	public double myDaughterGrade = 4.000000;

	public char myGender = 'F';

	public boolean iAmUSCitizen = true;

	public AboutMe() { // Constructor declare and initialized here.

		System.out.println(":------------ This is all about Myself ------------:");

	}

	public void aboutMe() { // method implemented.

		System.out.println("\nMy Name: " + myName + "\nMy Age: " + myAge + "\nMy Home Address: " + myHomeAddress
				+ "\nMy Monthly Salary: " + myMonthlySalary + "\nMy Height: " + myHeight + "\nMy Daughter Grade: "
				+ myDaughterGrade + "\nMy Gender: " + myGender + "\nI Am US Citizen: " + iAmUSCitizen);

	}

}
