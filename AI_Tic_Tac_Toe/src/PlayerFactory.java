
public class PlayerFactory {
	public Player getPlayer(String playerType){
		switch(playerType){
		case "HumanPlayer":
			return new HumanPlayer();
		case "HeuristicPlayer":
			return new HeuristicPlayer();
		default:
			return null;
		}
	}
}
