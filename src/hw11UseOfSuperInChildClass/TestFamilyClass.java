package hw11UseOfSuperInChildClass;

public class TestFamilyClass {

	public static void main(String[] args) {
		Father father1 = new Father();

		Father father2 = new Father(" Fatema Aktar", 31, 'F', true);

		father1.father();
		father1.fatherInfo("Nadia Jara", 20, 'F', true);

		Daughter daughter1 = new Daughter();
		Daughter daughter2 = new Daughter("March", 12);

		daughter1.daughter();
		daughter1.daughterInfo("June", 8);

	}

}
