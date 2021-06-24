package nenriki.entity;

public class Precious implements IStone {

	private int id;
	private int weight;
	private String name;
	public Precious(int id, int weight, String name) {
		super();
		this.id = id;
		this.weight = weight;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	
}
