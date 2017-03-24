package delta.monstarz.shared.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public abstract class Player {
	private String username;
	private PlayerColor playerColor;
	private int score;
	private int numTrains;
	private int minSelection;
	private HashMap<CardColor, Integer> trainCards;
	private List<DestCard> destCards = new ArrayList<>();
	private ArrayList<DestCard> destCardChoices;
	protected IPlayerState state;

	public Player(String username) {
		this.username = username;
		trainCards = new HashMap<>();
		CardColor[] colors = CardColor.values();
		for (int i = 0; i < colors.length; i++) {
			trainCards.put(colors[i], 0);
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPlayerColor(PlayerColor my_pcolor) {
		playerColor = my_pcolor;
	}

	public PlayerColor getPlayerColor() {
		return playerColor;
	}

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

	public List<DestCard> getDestCards() {
		return destCards;
	}

	public int getMinSelection() {
		return minSelection;
	}

	public void setMinSelection(int minSelection) {
		this.minSelection = minSelection;
	}

	public boolean isTakingTurn() {
		return state.isTakingTurn();
	}

	public HashMap<CardColor, Integer> getTrainCards() {
		return trainCards;
	}

	public ArrayList<DestCard> getDestCardChoices() {
		return destCardChoices;
	}

	public void setDestCardChoices(ArrayList<DestCard> destCardChoices) {
		state.drawDestinationCards(destCardChoices);
		//this.destCardChoices = destCardChoices;
	}


	public void startTurn() {
		state.startTurn();
	}

	protected void internalStartTurn() {

	}

	public void drawTrainCard(TrainCard card) {
		state.drawTrainCard(card);
	}

	protected void internalDrawTrainCard(TrainCard card) {
		CardColor cardColor = card.getColor();
		if (! trainCards.containsKey(cardColor)) {
			trainCards.put(cardColor, 0);
		}
		trainCards.put(cardColor, trainCards.get(cardColor) + 1);
	}

	public void selectTrainCard(TrainCard card) {
		state.selectTrainCard(card);
	}

	public void drawDestinationCards(ArrayList<DestCard> cards) {
		state.drawDestinationCards(cards);
	}

	protected void internalDrawDestinationCards(ArrayList<DestCard> cards) {
		destCardChoices = cards;
	}

	public void selectDestinationCards(ArrayList<DestCard> cards) {
		state.selectDestinationCards(cards);
	}

	protected void internalSelectDestinationCards(ArrayList<DestCard> cards) {
		destCards.addAll(cards);
	}

	int getMaxCardColorCount() {
		int maxCount = 0;
		for (int count : trainCards.values()) {
			if (count > maxCount) {
				maxCount = count;
			}
		}
		return maxCount;
	}

	public void claimRoute(Route route) {
		state.claimRoute(route);
	}

	protected void internalClaimRoute(Route route) {

	}

	public boolean canDrawTrainCard(){
		return state.canDrawTrainCard();
	}

	public boolean canSelectTrainCard(TrainCard card){
		return state.canSelectTrainCard(card);
	}

	public PlayerInfo playerInfo() {
		Collection<Integer> card_nums = trainCards.values();
		int numTrainsCards = 0;
		for (int n : card_nums) {
			numTrainsCards += n;
		}

		return new PlayerInfo(username, playerColor, score, numTrainsCards, destCards.size(), numTrains, false, isTakingTurn());
	}

}
