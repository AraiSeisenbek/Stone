package nenriki.entity;

public class SemiPrecious extends Precious implements IStone {
	public String type;
	public SemiPrecious(int id, int weight, String name, String type) {
		super(id, weight, name);
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
