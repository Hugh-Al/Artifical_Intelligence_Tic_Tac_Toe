
public class Board {
	private char[][] board;
	private final char EMPTY = ' ';

	public Board() {
		board = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	public void displayBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]);
				if (j != board.length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i != board.length - 1) {
				System.out.println("-----");
			}
		}
	}

	public char[][] getBoardState() {
		return board;
	}

	public boolean isGameCompleted() {
		if (winCondition() || boardFull()) {
			return true;
		}
		return false;
	}

	public boolean boardFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean winCondition() {
		// Check for rows that has 3 in a row
		for (int a = 0; a < 3; a++) {
			if (board[a][0] == board[a][1] && board[a][1] == board[a][2] && board[a][2] != ' ') {
				return true;
			}
		}
		// Check for cols that has 3 in a row
		for (int a = 0; a < 3; a++) {
			if (board[0][a] == board[1][a] && board[1][a] == board[2][a] && board[2][a] != ' ') {
				return true;
			}
		}
		// Check top left to bottom right diagonal for 3 in a row
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != ' ') {
			return true;
		}
		// Check top right to bottom left diagonal for 3 in a row
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != ' ') {
			return true;
		}

		return false;
	}

}
