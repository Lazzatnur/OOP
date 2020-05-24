package ass7week;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	public static void main(String args[]){  
		
		File file = new File("C:\\Users\\Lyazzat\\eclipse-workspace\\ass7week\\src\\ass7week\\fishes.txt");
	 
		Aquarium aqua = new Aquarium();
		try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	        	Fishes v =new Fishes();
	        	a.addpoint(v);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    System.out.println( a.fishname());
	    System.out.println( a.getFishname());
	   
		
	//aquarium.addFish( new Fishes("sazan", 200));
	
	}
	}
