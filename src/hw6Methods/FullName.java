package hw6Methods;

public class FullName {

	public String fName = "Fatema";
	public String lName = "Aktar";

	public String fullName(String fName, String lName) {
		String name = fName + lName;
		System.out.println("Family Member: " + fName + lName);

		return name;
	}

	public static void main(String[] args) {
		FullName name = new FullName();
		name.fullName("Fatema ", "Aktar");
		name.fullName("Nadia ", "Jara");
		name.fullName("Sabia ", "Iqra");
		name.fullName("Md ", "Hossain");

	}

}
