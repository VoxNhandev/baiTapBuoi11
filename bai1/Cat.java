package bai1;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Eating");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Meow meow...");
	}
		
	public void run()
	{
		System.out.println("running..");
	}
		

}
