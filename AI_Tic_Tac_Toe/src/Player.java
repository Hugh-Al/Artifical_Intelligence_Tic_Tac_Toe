import java.util.ArrayList;

public class Player implements PlayerInterface{

	public char tile;
	public Board currentBoard;
	public ArrayList<Board> neighbours;
	
	public Player() {
		neighbours = new ArrayList<>();
	}

	@Override
	public String makeMove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testPrint() {
		// TODO Auto-generated method stub
		System.out.println("This needs to be overridden");
	}

	@Override
	public String selectMove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getPotentialStates() {
		// TODO Auto-generated method stub
		
	}
}
