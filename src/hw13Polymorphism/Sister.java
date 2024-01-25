package hw13Polymorphism;

/*
 * Method Overloading: When different methods exist with the same method name but with different parameters or signature static polymorphism or early binding or compile time polymorphism or method Overrloding.
 

 */

public class Sister {

	public void sister() {
		System.out.println("This void type method from local sister");
	}

	public void sister(int a, int b) {

		int age1 = a + b;
		System.out.println("Total area from sister: " + age1);
	}

	public int sister(int a, int b, int c) {
		int age2 = a + b + c;
		System.out.println("Total area from sister: " + age2);
		return age2;
	}

	public int sister(float d, String e, int f) {
		int age3 = (int) d + Integer.parseInt(e) + f;
		System.out.println("Total area from sister:" + age3);
		return age3;
	}

	public int sister(String g, float h, int i) {
		int age4 = Integer.parseInt(g) + (int) h + i;
		System.out.println("Total area from sister: " + age4);
		return age4;
	}

	public final int sister(int a, int b, int c, int d) {
		int age5 = 1 + 2 + 3 + 4;
		System.out.println("Total area from Sister: " + age5);
		return age5;

	}

	public static int sister(int a, int ageb, int c, int d, int e) {
		int age6 = 1 + 2 + 3 + 4 + 5;
		System.out.println("Total area from Sister: " + age6);
		return age6;
	}

	
	}


