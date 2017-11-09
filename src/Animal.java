public class Animal implements Countable{

	private int count;
	
	public Animal() {
		this.count=1;
	}
	
	public void incrementCount() {
		this.count++;
	}
	
	public void resetCount() {
		this.count = 1;
	}
	
	public String getCountString() {
		return String.valueOf(count);
	}

	public int getCount() {
		return this.count;
	}
	
}
