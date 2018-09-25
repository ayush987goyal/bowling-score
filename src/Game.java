import java.util.ArrayList;
import java.util.Arrays;

public class Game {

	private ArrayList<Integer> rolls;

	public Game() {
		this.rolls = new ArrayList<>();
	}

	public Game(Integer[] rolls) {
		this.rolls = new ArrayList<>(Arrays.asList(rolls));
	}

	public void roll(int pins) {
		this.rolls.add(pins);
	}

	public int getScore() {
		int total = 0;

		for (Integer score : getFramewiseScore()) {
			total += score;
		}

		return total;
	}

	public ArrayList<Integer> getFramewiseScore() {
		ArrayList<Integer> scores = new ArrayList<>();
		int currIndex = 0;

		for (int i = 0; i < 10; i++) {
			if (isStrike(currIndex)) {
				scores.add(10 + this.rolls.get(currIndex + 1) + this.rolls.get(currIndex + 2));
				currIndex++;
			} else if (isSpare(currIndex)) {
				scores.add(10 + this.rolls.get(currIndex + 2));
				currIndex += 2;
			} else {
				scores.add(this.rolls.get(currIndex) + this.rolls.get(currIndex + 1));
				currIndex += 2;
			}
		}

		return scores;
	}

	private boolean isStrike(int index) {
		return this.rolls.get(index) == 10;
	}

	private boolean isSpare(int index) {
		return this.rolls.get(index) + this.rolls.get(index + 1) == 10;
	}

}
