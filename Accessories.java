package ass7week;

public class Accessories extends Aquarium {
	private String name;
	private Integer cost;
	
	public Accessories() {
		setName("accessory");
		setCost(0);
	}
		
	public Accessories(String n, Integer c) {
		this.setName(n);
		this.setCost(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}
}
