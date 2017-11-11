package business;
public class Aligator extends Animal {

	public Aligator() {
	}
	
	public Aligator(String name) {
		this.setName(name);
	}
	
	public String getCountString() {
		return String.valueOf(this.getCount())+" aligator";
	}
	
}
