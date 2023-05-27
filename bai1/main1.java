package bai1;

public class main1 {
	public static void main(String[] args) {
		
		Animal cat = new Cat();
		Cat c =  (Cat) cat;
		
		Animal bird = new Bird();
		Bird b = (Bird) bird;
		
		c.run();
		b.fly();
		
	}
}
