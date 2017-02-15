package deltamonstarz.tickettoride.presenters;

import java.util.Observable;
import java.util.Observer;

import deltamonstarz.tickettoride.ClientModel;
import deltamonstarz.tickettoride.IServerProxy;

public abstract class BasePresenter implements Observer {
	static IServerProxy proxy;
	static ClientModel model;

	BasePresenter() {
		model = ClientModel.getInstance();
	}

	public void setProxy(IServerProxy proxy) {
		this.proxy = proxy;
	}

	@Override
	public abstract void update(Observable o, Object arg);

	public void observe() {
		model.addObserver(this);
		model.setPresenter(this);
	}

	public void endObserve() {
		ClientModel.getInstance().deleteObserver(this);
	}

	public abstract void onConnectionError();

	public void onResume() {
		observe();
	}
}
