package core;

public class ToadPattern extends PatternGenerator {

	@Override
	public String[][] generatePattern() {
		String[][] state = getFreshState();
		state[1][1] = "x";
		state[1][2] = "x";
		state[1][3] = "x";
		state[2][2] = "x";
		state[2][3] = "x";
		state[2][4] = "x";
		return state;
	}

}
