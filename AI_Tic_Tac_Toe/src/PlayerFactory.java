
public class PlayerFactory {
	public Player getPlayer(String playerType){
		switch(playerType){
		case "HumanPlayer":
			return new HumanPlayer();
		case "HeuristicPlayer":
			return new HeuristicPlayer();
		case "RandomPlayer":
			return new RandomPlayer();
		default:
			return null;
		}
	}
}
