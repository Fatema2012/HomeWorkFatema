package hw13Polymorphism;

public class Niece extends Sister {
	@Override
	
	public void sister() {
		System.out.println("This void type method from Sister class");
	}
		@Override
		public void sister(int a, int b) {
			
			int age1 = a + b +50;		
			System.out.println("Total area from sister: " + age1);
		}
		@Override
		public int sister(int a, int b, int c) {
			int age2 = a/4 + b *5+ c + 20;
			System.out.println("Total area from sister: " + age2);
			return age2;
		}
		@Override
		public  int sister(float d,String e, int f) {
			int age3 = (int)d +Integer.parseInt(e)  + f/5;
			System.out.println("Total area from sister:" + age3);
			return age3;
			}
		
		
	}


