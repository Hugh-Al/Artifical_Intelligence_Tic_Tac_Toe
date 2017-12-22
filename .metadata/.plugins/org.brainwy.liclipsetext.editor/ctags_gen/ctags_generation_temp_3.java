
public class Game {

	public static void main(String[] args) {
		PlayerFactory playerFactory = new PlayerFactory();
		Player player1 = playerFactory.getPlayer("HumanPlayer");
		Player player2 = playerFactory.getPlayer("HeuristicPlayer");
		Board gameBoard = new Board();
		TicTacToe game = new TicTacToe(player1, player2, gameBoard);
		game.display();
//		System.out.println(player1.makeMove());
	}

}
