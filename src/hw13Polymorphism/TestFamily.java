package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n------------sister class------------------\n");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(8, 12);
		sister.sister(22,40, 10);
		sister.sister(3.447f,"50", 100);
		sister.sister("40",3.023f,30);
		sister.sister(22, 40, 10, 31);
		Sister.sister(22, 40, 10, 31, 50);

	}

}
