package delta.monstarz.shared;

import java.util.List;

import javax.security.auth.login.LoginException;

/**
 * Created by alex on 2/2/17.
 */

public interface IServer {
//    public void executeCommand(BaseCommand command) throws Exception;

    public String register(String username, String password); //throws LoginException;
    public String login(String username, String password);
    public int createGame(String username, String game_name, String auth);
    public List<GameInfo> listGames(String auth);
}
