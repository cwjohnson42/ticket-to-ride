package deltamonstarz.tickettoride.presenters;

import java.util.Observable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import delta.monstarz.shared.commands.JoinGameCommand;
import deltamonstarz.tickettoride.views.GameSelectorActivity;

public class GameSelectorPresenter extends Presenter{
	private static GameSelectorPresenter presenter;
	private GameSelectorActivity activity;

	private GameSelectorPresenter() {
		super();
	}

	public static GameSelectorPresenter getInstance() {
		if (presenter == null) {
			presenter = new GameSelectorPresenter();
		}
		return presenter;
	}

	public void setActivity(GameSelectorActivity activity) {
		this.activity = activity;
	}

	@Override
	public void update(Observable o, Object arg) {
		activity.onGameListUpdate();
	}

	/**
	 * Creates a new game
	 * Switches to GameView
	 * @param gameName name of the game to be created
	 */
	public void createGame(String gameName) {

	}

	/**
	 * Adds user to selected game
	 * Switches to GameView
	 * @param gameID gameID of the game chosen by the user
	 */
	public void joinGame(int gameID) {
		JoinGameCommand command = new JoinGameCommand(model.getUsername(), model.getGameID());
	}

	/**
	 * Tells the deltamonstarz.tickettoride.ServerProxy to logout the user
	 * Updates the client model and switched to LoginView
	 */
	public void logout() {
		model.setAuthToken(null);
	}

	/**
	 * Begins polling for a list of all current, joinable games
	 */
	public void pollGameList() {
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(new GamePoller(), 0, 2, TimeUnit.SECONDS);
	}

	private class GamePoller implements Runnable {
		@Override
		public void run() {
			proxy.listGames(model.getAuthToken());
		}
	}
}
