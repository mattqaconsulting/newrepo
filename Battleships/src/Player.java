import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	String name;
	Boolean hasWon;
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.hasWon = false;
	}
	

	
	
	public int[] shoot(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Row: ");
        int xCoord = input.nextInt();
        
        System.out.print("Column: ");
        int yCoord = input.nextInt();
        int[] coords = {xCoord, yCoord};

        
        return coords;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Boolean getHasWon() {
		return hasWon;
	}




	public void setHasWon(Boolean hasWon) {
		this.hasWon = hasWon;
	}

}
