public class DemoGame {

	public static void main(String[] args) {

		// playing cricket
		Game newGame = new Cricket();
		perform(newGame);

		// playing football
		newGame = new Football();
		perform(newGame);

		// playing tennis
		newGame = new Tennis();
		perform(newGame);

	}

	private static void perform(Game newGame) {
		newGame.play();

	}

}
