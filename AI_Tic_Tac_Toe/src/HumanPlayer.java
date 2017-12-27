import java.util.Scanner;

public class HumanPlayer extends Player{
	
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
//		reader.close();
		return input;
	}

	@Override
	public void testPrint() {
		System.out.println("Testing interface inside human player");
		
	}

	@Override
	public String selectMove() {
		// TODO Auto-generated method stub
		return null;
	}
	



}
