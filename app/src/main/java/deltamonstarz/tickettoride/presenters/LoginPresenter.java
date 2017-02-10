package deltamonstarz.tickettoride.presenters;

import java.util.Observable;
import java.util.Observer;

import deltamonstarz.tickettoride.ClientModel;
import deltamonstarz.tickettoride.ServerProxy;
import deltamonstarz.tickettoride.exceptions.ConnectionException;
import deltamonstarz.tickettoride.views.LoginActivity;

public class LoginPresenter implements Observer {
	private static LoginPresenter presenter = new LoginPresenter();
	private LoginActivity activity;
	private ServerProxy proxy;

	private LoginPresenter() {}

	public static LoginPresenter getInstance() {
		return presenter;
	}

	public void observe() {
		ClientModel.getInstance().addObserver(this);
	}

	public void stopObserve() {
		ClientModel.getInstance().deleteObserver(this);
	}

	public void setActivity(LoginActivity activity) {
		this.activity = activity;
	}

	@Override
	public void update(Observable o, Object arg) {
		ClientModel model = (ClientModel) o;
		if (model.getAuthToken() != null) {
			activity.onLogin();
		} else {

		}
	}

	/**
	 * Tells the deltamonstarz.tickettoride.ServerProxy to create a user with the given username and password
	 * If successful, updates the client model and switches to GameSelectView
	 * @param username the new username
	 * @param password the corresponding password
	 */
	public void register(String ipAddress, String portNum, String username, String password) throws ConnectionException{
		proxy = ServerProxy.getInstance(ipAddress, portNum);
		proxy.register(username, password);
//		String authToken =
	}

	/**
	 * Tells the deltamonstarz.tickettoride.ServerProxy to authenticate the given user information
	 * If successful, updates the client model and switches to GameSelectView
	 * @param username the username to be validated
	 * @param password the corresponding password
	 */
	public void login(String ipAddress, String portNum, String username, String password) throws ConnectionException {
		proxy = ServerProxy.getInstance(ipAddress, portNum);
		proxy.login(username, password);
//		String authToken =
	}
}
