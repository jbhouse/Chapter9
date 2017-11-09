public class Sheep extends Animal implements Cloneable {

	private String name;
	
	public Sheep() {
	}
	
	public String getCountString() {
		return String.valueOf(this.getCount()) + " " + this.getName();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
