package hw10Abstraction;
/*
 *  How many keywords are used for the inheritance in Interface, answered by Java comments? University extends College, Hospital. Can an interface inherit other Interfaces, or a regular class or abstract class by extends keyword? How many inheritances are possible? Use the Interface -- "University" to answer my questions (by multiple line comments).
 */
public interface University  extends College, Hospital{// only one

	public void classSize();

	public void playGround();

	public void teacher();
	
public void gymnasiu();	
	
public static void  library() {
	
}
	

// public University() {}
// Interfaces can not have a Constructor 

}
