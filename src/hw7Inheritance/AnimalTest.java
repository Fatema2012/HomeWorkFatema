package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		/*
		 * Use Java comments to show single inheritance, multilevel inheritance, and Hierarchical inheritance by example from the above. Also, as shown by java comments who is the Parent class, and who is the child class for at least one class?
		 */
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n---------------------------------\n");

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("\n---------------------------------\n");

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n---------------------------------\n");
		
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("\n-----------------------------------------\n");
		
		
	Dog dog = new Dog();	
	dog.dogInfo();
	dog.mammalInfo();
	dog.animalInfo();
System.out.println("\n---------------------------------------------------\n");


Mammal mammal = new Mammal();
mammal.mammalInfo();
mammal.animalInfo();
System.out.println("\n-----------------------------------------------------\n");


Reptile reptile = new Reptile();
reptile.reptileInfo();
reptile.animalInfo();
System.out.println("\n------------------------------------------------------\n");


Robin robin = new Robin();
robin.robinInfo();
robin.birdsInfo();
robin.animalInfo();
System.out.println("\n-----------------------------------------------------------\n");


Snake snake = new Snake();
snake.snakeInfo();
snake.reptileInfo();
snake.animalInfo();
System.out.println("\n----------------------------------------------------------\n");
	}



	}


