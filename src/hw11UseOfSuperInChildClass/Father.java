package hw11UseOfSuperInChildClass;

public class Father {

	public String familyName;
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;

	public Father() {
		System.out.println("This is default constructor From father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("\nName: " + name + "\nAge: " + age + "\nGender: " + sex + "\nusCitizen: " + usCitizen);
	}

	public void father() {
		System.out.println("This is method Implemented from father class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("\nMy Name: " + name + "\nAge: " + age + "\nGender: " + sex + "\nusCitizen: " + usCitizen);
	}

}
