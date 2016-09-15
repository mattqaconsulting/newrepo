import java.util.Scanner;


public class Main {
	static Boolean p1HasWon = false;
	static Boolean p2HasWon = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("enter name of player 1" + "\n");
		Player player1 = new Player(input.next());
		System.out.println("player 1 is called: " + player1.getName() + "\n");


		System.out.println("enter name of player 2");
		Player player2 = new Player(input.next());
		System.out.println("player 2 is called: " + player2.getName() + "\n");


		Board board = new Board(new int[7][7]);
		board.initBoard(board);
		//board.showBoard(board);

		//input.next();








		/*do{
			
			
			
			
			
			hasWon = true;
			
		}while(!hasWon);
		
		System.out.println("congratulations you have won");*/
	}
	
	
	
	
	

}
