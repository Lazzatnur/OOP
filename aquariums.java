package ass7week;

public class Aquarium {
	private String Aquarium;
	private Integer cost;
	public Aquarium() {
		Aquarium="Aquarium";
		cost=0;
	}
	public Aquarium(String a, Integer c) {
		this.Aquarium=a;
		this.cost=c;
	}
	public String getAquarium() {
		return Aquarium;
	}
	public void setAquarium(String Aquarium) {
		this.Aquarium = Aquarium;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer prize) {
		this.cost = prize;
	}

}


//import java.util.ArrayList;
//	import java.util.List;

//	public class Aquarium {
//  private List<Fishes> Fish = new ArrayList<>();

//  public void addFish(Fishes Fish ){
//  	Fishes.add(Fish);
//  }

//  public void startWork() {
//  	Fishes.forEach( e -> e.work());
//  }
//	}
