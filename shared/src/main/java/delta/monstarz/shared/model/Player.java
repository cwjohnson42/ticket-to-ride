package delta.monstarz.shared.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Trevor on 2/2/2017.
 */

public class Player {
	private String username;
	private PlayerColor playerColor;
	private int score;
	private int numTrains;
	private int minSelection;
	private Map<TrainCard, Integer> trainCards;
	private List<DestCard> destCards = new ArrayList<>();
	private ArrayList<DestCard> destCardChoices;

	public ArrayList<DestCard> getDestCardChoices() {
		return destCardChoices;
	}

	public void setDestCardChoices(ArrayList<DestCard> destCardChoices) {
		this.destCardChoices = destCardChoices;
	}

	public Player(String username){
		this.username = username;
		trainCards = new HashMap<>();
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPlayerColor(PlayerColor my_pcolor) { playerColor = my_pcolor; }

	public PlayerColor getPlayerColor() { return playerColor; }

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNumTrains() {
		return numTrains;
	}

	public void setNumTrains(int numTrains) {
		this.numTrains = numTrains;
	}

//	public Map<TrainCard, Integer> getTrainCards() {
//		return trainCards;
//	}
//
//	public void setTrainCards(Map<TrainCard, Integer> trainCards) {
//		this.trainCards = trainCards;
//	}

	public List<DestCard> getDestCards() {
		return destCards;
	}

	public void setDestCards(List<DestCard> destCards) {
		this.destCards = destCards;
	}

	public int getMinSelection() {
		return minSelection;
	}

	public void setMinSelection(int minSelection) {
		this.minSelection = minSelection;
	}

	public void drawTrainCard(TrainCard card) {
		if (! trainCards.containsKey(card)) {
			trainCards.put(card, 0);
		}
		trainCards.put(card, trainCards.get(card) + 1);
	}

	public void addDestCard(DestCard card) {
		destCards.add(card);
	}
}
