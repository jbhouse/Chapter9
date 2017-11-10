public class Animal implements Countable{

	private int count;
	
	public Animal() {
		count=1;
	}
	
	public void incrementCount() {
		count++;
	}
	
	public void resetCount() {
		count = 1;
	}
	
	public String getCountString() {
		return String.valueOf(count);
	}

	public int getCount() {
		return this.count;
	}
	
}
