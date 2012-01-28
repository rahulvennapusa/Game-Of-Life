package core;

public class BlinkerPattern extends PatternGenerator {

	@Override
	public String[][] generatePattern() {
		String[][] state = getFreshState();
		state[0][1] = "x";
		state[1][1] = "x";
		state[2][1] = "x";

		return state;
	}

}
