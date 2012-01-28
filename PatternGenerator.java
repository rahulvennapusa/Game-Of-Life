package core;

public abstract class PatternGenerator {

	public abstract String[][] generatePattern();

	public static String[][] getFreshState() {
		String[][] state = new String[Globals.MAX_X][Globals.MAX_Y];
		for (int i = 0; i < Globals.MAX_X; i++) {
			state[i] = new String[Globals.MAX_Y];
			for (int j = 0; j < Globals.MAX_Y; j++) {
				state[i][j] = "-";
			}
		}
		return state;
	}

}
