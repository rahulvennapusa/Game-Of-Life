package core;

public class Game {

	private Board board;
	private static Game game = null;

	private Game() {

	}

	Game(String[][] state) {
		board = new Board(state);
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public void proceed() {
		board.progress();
	}

	public void printCurrentState() {
		board.printState();
	}

	public void play() {
		System.out.println("\nBEFORE");
		printCurrentState();
		proceed();
		System.out.println("\nAFTER");
		printCurrentState();
	}

	public static Game getInstace(String[][] input) {
		if (game == null) {
			game = new Game(input);
		}
		return game;

	}

}
