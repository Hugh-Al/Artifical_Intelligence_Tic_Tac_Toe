import java.util.Scanner;

public class HumanPlayer implements Player{

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



}
