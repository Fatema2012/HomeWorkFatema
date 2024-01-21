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
		System.out.println("\n.......................................\n");
	}

	public Daughter(String birthMonth, int age) {
		super("Iqra", 8, 'F', true);
		super.father();
		super.fatherInfo("March", 24, 'F', true);
		super.name = "Tani";
		super.age = 32;
		super.sex = 'F';
		System.out.println("\nMy Name: " + name + "/nMyage:" + age + "/nSex:" + sex);

		// super();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("\nBirth Month:" + birthMonth + "\nAge:" + age);
		System.out.println("\n---------*************-------------------------/n");
	}

	public void daughter() {
		super.father();
		super.fatherInfo("July", 80, 'F', true);
		System.out.println("This method is implement From Child Class");
		System.out.println("\n-------------- This is daughter method from daughter class-------------------/n");
	}

	public void daughterInfo(String birthMonth, int age) {
		System.out.println("This parameterized method");
		System.out.println("Birth Month: " + birthMonth + "\nAge " + age);
		System.out.println("\n-------------- This is daughteInfo method from daughter class-------------------/n");

	}

}
