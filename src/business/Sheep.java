package business;
public class Sheep extends Animal implements Cloneable {

	
	public Sheep() {
	}
	
	public Sheep(String name) {
		this.setName(name);
	}
	
	public String getCountString() {
		return String.valueOf(this.getCount()) + " " + this.getName();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
