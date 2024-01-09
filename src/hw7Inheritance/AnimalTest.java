package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();// Single inheritance.
		animal.animalInfo();
		System.out.println("\n---------------------------------\n");

		Birds birds = new Birds();// Hierarchical inheritance.
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("\n---------------------------------\n");

		BullDog bullDog = new BullDog();// Multilevel Inheritance.
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n---------------------------------\n");

		Cobra cobra = new Cobra();// Multilevel Inheritance.
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("\n-----------------------------------------\n");

		Dog dog = new Dog(); // Multilevel Inheritance.
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("\n---------------------------------------------------\n");

		Mammal mammal = new Mammal();// Hierarchical Inheritance.
		mammal.mammalInfo();
		mammal.animalInfo();
		System.out.println("\n-----------------------------------------------------\n");

		Reptile reptile = new Reptile();// Hierarchical Inheritance.
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n------------------------------------------------------\n");

		Robin robin = new Robin();// Multilevel Inheritance.
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("\n-----------------------------------------------------------\n");

		Snake snake = new Snake();// Multilevel Inheritance
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("\n----------------------------------------------------------\n");
	}

}
