package core;

public class BlockPattern extends PatternGenerator {

	public String[][] generatePattern() {

		String[][] state = getFreshState();
		state[1][1] = "x";
		state[1][2] = "x";
		state[2][1] = "x";
		state[2][2] = "x";
		return state;
	}

}
