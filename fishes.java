package ass7week;
import java.io.File;
public class Fishes extends Aquarium {
		private String fishname;
		private Integer cost;
		
		 File file = new File("C:\\Users\\Lyazzat\\eclipse-workspace\\1stTask\\src\\ass7week//fishes.txt");
		 
		public Fishes () {
			fishname="fish";
			cost=0;
		}
		public Fishes(String f, Integer p) {
			this.fishname=f;
			this.cost=p;
		}
		public String getFishname() {
			return fishname;
		}
		public void setFishname(String fishname) {
			this.fishname = fishname;
		}
		public Integer getCost() {
			return cost;
		}
		public void setCost(Integer prize) {
			this.cost = prize;
		}

}
