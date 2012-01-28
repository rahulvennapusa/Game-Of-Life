package core;

import java.util.Random;

public class RandomPattern extends PatternGenerator {

	@Override
	public String[][] generatePattern() {

		Random r = new Random();
		String[][] state = new String[Globals.MAX_X][Globals.MAX_Y];
		for (int i = 0; i < Globals.MAX_X; i++) {
			state[i] = new String[Globals.MAX_Y];
			for (int j = 0; j < Globals.MAX_Y; j++) {
				state[i][j] = r.toString();
			}
		}
		return state;

	}

}
