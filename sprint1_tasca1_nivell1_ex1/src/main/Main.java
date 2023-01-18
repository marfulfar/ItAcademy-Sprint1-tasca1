package main;

import instruments.DeCorda;
import instruments.DePercussio;
import instruments.DeVent;

public class Main {

	
	static{
        System.out.println("classe instruments iniciada per static");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeVent flute = new DeVent("flute", 60);
		flute.play();
		
		//DeCorda guitar = new DeCorda("guitar", 40);
		//guitar.play();
		
		//DePercussio drum = new DePercussio("drum", 100);
		//drum.play();
		
	}

}
