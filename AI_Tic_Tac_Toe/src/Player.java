import java.util.ArrayList;

public class Player {

	public char tile;
	public Board currentBoard;
	public ArrayList<Board> neighbours;
	
	public Player() {
		neighbours = new ArrayList<>();
	}
}
