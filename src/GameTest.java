import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testGetScore() {
		Integer[] rolls = { 10, 7, 3, 7, 2, 9, 1, 10, 10, 10, 2, 3, 6, 4, 7, 3, 3 };
		Game game = new Game(rolls);
		
		assertEquals(168, game.getScore());
	}

}
