
public class GameDriver {
	public static void main(String[] args) {
		PlayerFactory playerFactory = new PlayerFactory();
		Player player1 = playerFactory.getPlayer("HumanPlayer");
		Player player2 = playerFactory.getPlayer("HeuristicPlayer");
		Board gameBoard = new Board();
		TicTacToe game = new TicTacToe(player1, player2, gameBoard);
		while(!gameBoard.isGameCompleted()){
			game.display();
			player1.makeMove();
		}
		
	}
}
