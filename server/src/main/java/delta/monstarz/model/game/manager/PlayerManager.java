package delta.monstarz.model.game.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import delta.monstarz.shared.model.Player;

/**
 * @author bradcarter
 */
public class PlayerManager
{
	//Class Fields
	public static final int MAX_PLAYERS = 5;

	//Instance Variables
	Set<Player> players;
	Player owner;
	Player current;

	//Constructors

	public PlayerManager()
	{
		players = new HashSet<>();
	}


	//Object Methods

	//Getters and Setter


	public Set<Player> getPlayers()
	{
		return players;
	}

	public TreeSet<String> getPlayerNames()
	{
		TreeSet<String> names = new TreeSet<>();
		for(Player p : players)
		{
			names.add(p.getUsername());
		}
		return names;
	}

	public Player getPlayerByUsername(String username) {
		for (Player p : players) {
			if (p.getUsername().equals(username)) {
				return p;
			}
		}
		return null;
	}

	//Public Methods
	public int size()
	{
		return players.size();
	}

	public void add(Player player)
	{
		players.add(player);
	}

	//Internal Methods

	//Sub Class Methods-------------------------------------------------------
	//Protected Methods

	//Abstract Methods
}