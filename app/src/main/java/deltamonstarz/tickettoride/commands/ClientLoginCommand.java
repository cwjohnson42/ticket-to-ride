package deltamonstarz.tickettoride.commands;

import delta.monstarz.shared.commands.LoginCommand;
import deltamonstarz.tickettoride.ClientModel;
import deltamonstarz.tickettoride.presenters.LoginPresenter;

public class ClientLoginCommand extends LoginCommand {
	public ClientLoginCommand(String username) {
		super(username);
	}

	@Override
	public void execute() {
		if (loginSuccessful) {
			ClientModel.getInstance().addLoginInformation(username, authToken);
		} else {
			LoginPresenter.getInstance().notify();
		}
	}
}
