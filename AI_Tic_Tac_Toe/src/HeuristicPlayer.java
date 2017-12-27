import java.util.ArrayList;
import java.util.Scanner;

public class HeuristicPlayer extends Player{
	
	
	public HeuristicPlayer(){
		System.out.println("Creating heuristic Player");
	}

	@Override
	public String makeMove() {
		
		return "A1";
	}
	
	public void getNeighbours() {
		
	}
	
	public void getCurrentBoardState() {
		
	}

	@Override
	public void testPrint() {
		System.out.println("Testing interface insider heuristics");
	}

	@Override
	public String selectMove() {
		// TODO Auto-generated method stub
		return null;
	}
	



}
