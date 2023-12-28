package hw4JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe fatema = new AboutMe();
		fatema.myName = "Fatema";// variable initialized.
		fatema.myAge = 32;
		fatema.myMonthlySalary = 32000;
		fatema.myHomeAddress = 12047;
		fatema.myYearlySalary = 500000;
		fatema.myHeight = 5.3f;
		fatema.myDaughterGPA = 4.0;
		fatema.myGender = 'F';
		fatema.iAmUSCitizen = true;

		fatema.aboutMe();// method initialized.

		AboutMe alex = new AboutMe();
		alex.myName = "Alex";// variable initialized.
		alex.myAge = 34;
		alex.myMonthlySalary = 32100;
		alex.myHomeAddress = 12047;
		alex.myYearlySalary = 50000;
		alex.myHeight = 5.4f;
		alex.myDaughterGPA = 4.0;
		alex.myGender = 'F';
		alex.iAmUSCitizen = true;

		alex.aboutMe();// method initialized.

	}

}
