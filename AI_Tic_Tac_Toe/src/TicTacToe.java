
public class TicTacToe {
	public Player player1;
	private Player player2;
	public Board gameBoard;
	private boolean isP1Turn;
	
	public TicTacToe(Player player1, Player player2, Board gameBoard){
		this.player1 = player1;
		this.player1.tile = 'X';
		this.player2 = player2;
		this.player2.tile = 'O';
		this.gameBoard = gameBoard;
		isP1Turn = true;
	}
	
	public void display(){
		gameBoard.displayBoard();
	}
	
	public boolean isGameCompleted(){
		return gameBoard.isGameCompleted();
	}
	
	private void provideCurrentBoardState() {
		player1.currentBoard = gameBoard;
		player2.currentBoard = gameBoard;
	}
	
	public void play() {
		gameBoard.displayBoard();
		gameBoard.playMove("C3", 'X');
		gameBoard.displayBoard();
//		while(!gameBoard.boardFull()){
//			gameBoard.displayBoard();
//			if(isP1Turn) {
//				player1.currentBoard = gameBoard;
//				gameBoard.takeMove("a");
//				isP1Turn = false;
//			} else {
//				player2.currentBoard = gameBoard;
//				gameBoard.takeMove("b");
//				isP1Turn = true;
//			}
//		}
//		gameBoard.displayBoard();
	}
}
