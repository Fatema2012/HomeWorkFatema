package hw11UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("June", 30, 'F', true);
		System.out.println("This is default constructor from Child Class ");
		super.familyName = "Shahadat";// This variable Initialized here from father class
	}

	public Daughter(String birthMonth, int age) {
		super("Iqra", 8, 'F', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nBirth Month:" + birthMonth + "\nAge:" + age);

	}

	public void daughter() {
		System.out.println("This method is implement From Child Class");
	}

	public void daughterInfo(String birthMonth, int age) {
		System.out.println("This parameterized method");
		System.out.println("Birth Month: " + birthMonth + "\nAge " + age);

	}

}
