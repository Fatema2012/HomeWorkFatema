package hw12Abstraction;

public class RockefellerUniversity extends  EngineeringSchool implements AeronauticalSchool{

	public void maths() {
		System.out.println("This is  maths from RockfellerUniversity regular Class");
	}

	@Override
	public void aeronauticalInfo() {
	System.out.println("  This is aeronauticalInfo from AeronauticalSchool Interface");	
		
	}

	@Override
	public void mechanicalLab() {
	System.out.println("  This is mechanicalLab from EngineeringSchool abstract class");	
		
	}
}
