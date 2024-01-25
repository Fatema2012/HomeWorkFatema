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
		
		
	System.out.println("\n-----------------Niece class------------------------\n");	
	Niece niece = new Niece();
	niece.sister();
	niece.sister(8, 12);
	niece.sister(22,40, 10);
	niece.sister(3.447f,"50", 100);
	niece.sister("40",3.023f,30);sister.sister(22, 40, 10, 31);
	
		
		

	}

}
