
public class Compass {

	
	public Compass(int newplayerlocation,int rubylocation) { 
		
		if(newplayerlocation==rubylocation)  { 
			System.out.println("you win!"); 
		}
		else if(rubylocation-newplayerlocation>=50 || newplayerlocation-rubylocation>=50) { 
			System.out.println("you are 5m away!"); 
		}
		else if(rubylocation-newplayerlocation>=25 || newplayerlocation-rubylocation>=25) { 
			System.out.println("you are 2.5m away!"); 
		}
		else if(rubylocation-newplayerlocation>=10 || newplayerlocation-rubylocation>=10) { 
			System.out.println("you are 1m away!"); 
		}
	}
}
