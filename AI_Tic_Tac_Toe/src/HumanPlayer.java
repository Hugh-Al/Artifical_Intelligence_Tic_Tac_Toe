import java.util.Scanner;

public class HumanPlayer implements Player{

	public HumanPlayer(){
		System.out.println("Creating Human Player");
	}
	
	@Override
	public int makeMove() {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Which row to place your marker?");
		int row = reader.nextInt();
		System.out.println("Which col to place your marker?");
		int col = reader.nextInt();
		return (row*3) + col;
	}



}
