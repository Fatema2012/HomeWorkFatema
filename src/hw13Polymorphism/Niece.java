package hw13Polymorphism;
/*
 * Method Overriding: The same method name with same parameters or signature but different
 * syntax or logic, dynamic polymorphism or late binding or method overriding or runtime polymorphism. 
 */
public class Niece extends Sister {
	@Override
	
	public void sister() {
		System.out.println("This is from void type method from Niece ");
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
		@Override
		public int sister(String g, float h, int i) {
			int age4 = Integer.parseInt(g)*6+ (int) h/5 + 50;
			System.out.println("Total area from sister: " + age4);
			return age4;	
		}
	/*
	 * 	Final type method  cannot override , cannot override the final method from niece class.
	 * 
	 * Static Type method implemented, niece can,not override or implemented because static is a local member of a class so static method can,t override. 
	 */
		
	
	 
	 // 	@Override
	  
	
	//public final int sister(int a, int b, int c, int d) {
		//int age5 = 1 + 2 + 3 + 4;
		//System.out.println("Total area from Sister: " + age5);
	//	return age5;}
		
//	@Override
		//public static int sister(int a, int ageb, int c, int d, int e) {
		//	int age6 = 1 + 2 + 3 + 4 + 5;
		//	System.out.println("Total area from Sister: " + age6);
		//	return age6;}
			
		
		}
		



