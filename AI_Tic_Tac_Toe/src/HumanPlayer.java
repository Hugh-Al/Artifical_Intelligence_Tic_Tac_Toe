import java.util.Scanner;

public class HumanPlayer extends Player implements PlayerInterface{
	
	private Board currentBoard;

	public HumanPlayer(){
		System.out.println("Creating Human Player");
	}
	
	@Override
	public String makeMove() {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		//TODO validate the move
		System.out.println(input);
		return input;
	}

	@Override
	public void testPrint() {
		System.out.println("Testing interface inside human player");
		
	}
	



}
