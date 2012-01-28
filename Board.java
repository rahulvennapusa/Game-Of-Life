package core;

public class Board {

	public String[][] coreState;

	public Board(String[][] seed) {
		this.coreState = seed;
	}

	public int adjacentLivesCount(int xIndex, int yIndex) {
		int total = 0;
		if (areInBounds(xIndex - 1, yIndex - 1).equalsIgnoreCase("x"))
			total += 1;
		if (areInBounds(xIndex - 1, yIndex).equalsIgnoreCase("x"))
			total += 1;
		if (areInBounds(xIndex - 1, yIndex + 1).equalsIgnoreCase("x"))
			total += 1;
		if (areInBounds(xIndex, yIndex - 1).equalsIgnoreCase("x"))
			total += 1;
		if (areInBounds(xIndex, yIndex + 1).equalsIgnoreCase("x"))
			total += 1;
		if (areInBounds(xIndex + 1, yIndex - 1).equalsIgnoreCase("x"))
			total += 1;
		if (areInBounds(xIndex + 1, yIndex).equalsIgnoreCase("x"))
			total += 1;
		if (areInBounds(xIndex + 1, yIndex + 1).equalsIgnoreCase("x"))
			total += 1;
		return total;
	}

	private String areInBounds(int x, int y) {
		if (x >= 0 && y >= 0 && x < Globals.MAX_X && y < Globals.MAX_Y)
			return coreState[x][y];
		return "-";
	}

	public void printState() {
		for (int i = 0; i < coreState.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < coreState[i].length; j++)

				System.out.print(coreState[i][j]);
			System.out.print(" ");
		}
	}

	public void progress() {
		PatternGeneratorFactory patternFactory = new PatternGeneratorFactory();
		String[][] newState = patternFactory.generateSpecificPattern("fresh");
		for (int i = 0; i < coreState.length; i++) {
			for (int j = 0; j < coreState[i].length; j++) {
				int nearLives = adjacentLivesCount(i, j);
				newState[i][j] = coreState[i][j];
				if (coreState[i][j].equalsIgnoreCase("x")) {
					if (nearLives < 2 || nearLives > 3)
						newState[i][j] = "-";
				} else {
					if (nearLives == 3) {
						newState[i][j] = "x";
					}
				}
			}
		}
		coreState = newState;
	}
}
