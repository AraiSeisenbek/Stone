package nenriki.entity;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
	
	private int id;
	private String name;
	private String quality;
	private List<IStone> numberOfPrecious = new ArrayList<IStone>();
	private List<IStone> numberOfSemiPrecious = new ArrayList<IStone>();
	public Necklace(int id, String name, String quality) {
		super();
		this.id = id;
		this.name = name;
		this.quality = quality;
	}
	
	public int calculateTotalWeight() {
		int weight = 0;
		for(int i = 0; i < numberOfPrecious.size(); i++) {
			weight += numberOfPrecious.get(i).getWeight();
		}
		for(int i = 0; i < numberOfSemiPrecious.size(); i++) {
			weight += numberOfSemiPrecious.get(i).getWeight();
		}
		return weight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}

	public List<IStone> getNumberOfPrecious() {
		return numberOfPrecious;
	}

	public void setNumberOfPrecious(List<IStone> numberOfPrecious) {
		this.numberOfPrecious = numberOfPrecious;
	}

	public List<IStone> getNumberOfSemiPrecious() {
		return numberOfSemiPrecious;
	}

	public void setNumberOfSemiPrecious(List<IStone> list) {
		this.numberOfSemiPrecious = list;
	}
	
}
