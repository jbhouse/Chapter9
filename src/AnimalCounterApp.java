
public class AnimalCounterApp {
	
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
		Sheep dolly;
		try {
			dolly = (Sheep) blackie.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			dolly = null;
		}
		dolly.setName("Dolly");
		count(dolly, 3);
		count(blackie, 1);
	}
	
	public static void count(Countable animal, int maxCount) {
		animal.resetCount();
		for (int i = 0; i < maxCount; i++) {
			System.out.println(animal.getCountString());
			animal.incrementCount();
		}
		System.out.println();
	}

}
