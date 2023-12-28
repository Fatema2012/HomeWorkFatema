package hw5Q2Constructor;

/*
 * Step3: Declare the default constructor and only one parameterized constructor (hints: source -- generate constructor using fields-). Use only one System.out.println() in the parameterized constructor to declare the above variables.


 */
public class Student {

	public String stName;
	public int stID;
	public char gender;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class.");

	}

	public Student(String stName, int stID, char gender, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.gender = gender;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("\nStudent name: " + stName + "\nId: " + stID + "\nGender: " + gender
				+ " \nJava Programmer: " + isProgrammer + "\nGrade: " + grade);
	}

}
