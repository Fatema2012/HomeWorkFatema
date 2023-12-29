package hw5Q1Constructor;

public class ComputerTest {

	public static void main(String[] args) {
	
	Computer computer1 = new Computer();	//default Constructor initialized
	
	Computer computer2 = new Computer("Apple", "MacBook Air","MacOS Mojave", 800, 'A' , false);	// this parameterized constructor.
	
	Computer computer3 = new Computer("HP", "15-ef2033dx", "Microsoft Windows", 700 , 'C' , true);	
		
	}

}
