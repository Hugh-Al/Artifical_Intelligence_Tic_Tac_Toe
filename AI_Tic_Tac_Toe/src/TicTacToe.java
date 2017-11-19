
public class TicTacToe {
	private Player player1;
	private Player player2;
	private Board gameBoard;
	
	public TicTacToe(Player player1, Player player2, Board gameBoard){
		this.player1 = player1;
		this.player2 = player2;
		this.gameBoard = gameBoard;
	}
	
	public void display(){
		gameBoard.displayBoard();
	}
}
