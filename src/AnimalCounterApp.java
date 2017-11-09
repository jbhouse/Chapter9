
public class AnimalCounterApp {

	public static void count(Countable c, int maxCount) {
		c.resetCount();
		for (int i = 0; i < maxCount; i++) {
			System.out.println(c.getCountString());
			c.incrementCount();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Counting alligators...");
		System.out.println();
		Aligator gator = new Aligator();
		count(gator, 3);
		System.out.println("Counting sheep...");
		System.out.println();
		Sheep blackie = new Sheep();
		blackie.setName("blackie");
		count(blackie, 2);
//		error was caused by: Sheep dolly;
		Sheep dolly;
		try {
			dolly = (Sheep) blackie.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("you dun goofed");
			e.printStackTrace();
			dolly = null;
		}
		dolly.setName("Dolly");
		count(dolly, 3);
		count(blackie, 1);
	}

}
