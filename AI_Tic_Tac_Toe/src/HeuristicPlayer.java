import java.util.ArrayList;
import java.util.Scanner;

public class HeuristicPlayer extends Player implements PlayerInterface{
	
	
	public HeuristicPlayer(){
		System.out.println("Creating heuristic Player");
		neighbours = new ArrayList<>();
	}

	@Override
	public String makeMove() {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		//TODO validate the move
		reader.close();
		return input;
	}
	
	public void getNeighbours() {
		
	}
	
	public void getCurrentBoardState() {
		
	}

	@Override
	public void testPrint() {
		System.out.println("Testing interface insider heuristics");
		
	}



}
