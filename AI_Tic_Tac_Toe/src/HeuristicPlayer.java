import java.util.Scanner;

public class HeuristicPlayer implements Player{

	public HeuristicPlayer(){
		System.out.println("Creating heuristic Player");
	}

	@Override
	public String makeMove() {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		//TODO validate the move
		return input;
	}



}
