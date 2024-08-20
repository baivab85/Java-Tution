package revesion.data;

public class HumanRepresentation {
	private static final Object HumanRepresentation = null;
	private String name;
	private int height;
	private int weight;
	
	
	public HumanRepresentation(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	public HumanRepresentation() {
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	public String toString() {
		return "HumanRepresentation [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	





	public boolean equals(Object obj) {
		HumanRepresentation other = (HumanRepresentation) obj;
		if(this.name.equals(other.getName())
				&& this.height==other.getHeight()
				&& this.weight==other.getWeight()
				)
		
		return true;
		
		else return false;
	}

}
