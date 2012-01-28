package core;

public class BoatPattern extends PatternGenerator {

	public String[][] generatePattern() {

		String[][] state = getFreshState();
		state[0][1] = "x";
		state[1][0] = "x";
		state[2][1] = "x";
		state[0][2] = "x";
		state[1][2] = "x";
		return state;
	}
}
