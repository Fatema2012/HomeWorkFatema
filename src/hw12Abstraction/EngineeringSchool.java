package hw12Abstraction;

public abstract class EngineeringSchool extends NYUniversity{

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("ComputerLab is non abstract method ");
	}

}
