package business;
public class Animal implements Countable{

	private int count;
	private String name;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
