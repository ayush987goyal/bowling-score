public class App {

	public static void main(String[] args) {
		Integer[] rolls = { 10, 7, 3, 7, 2, 9, 1, 10, 10, 10, 2, 3, 6, 4, 7, 3, 3 };
		Game game = new Game(rolls);
		System.out.println(game.getScore());
		System.out.println(game.getFramewiseScore());
	}
}
