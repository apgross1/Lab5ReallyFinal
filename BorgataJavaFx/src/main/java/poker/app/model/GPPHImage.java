package poker.app.model;

import java.util.ArrayList;

import pokerBase.GamePlay;
import pokerBase.GamePlayPlayerHand;
import pokerBase.Player;

public class GPPHImage extends GamePlayPlayerHand {
	private ArrayList<CardImage> playerImgHand = new ArrayList<CardImage>();
	private GamePlayPlayerHand GPPH;
	
	public GPPHImage(GamePlayPlayerHand GPPH) {
		this.GPPH = GPPH;
	}

	public ArrayList<CardImage> getPlayerImgHand() {
		return playerImgHand;
	}

	public void addPlayerImgHand(CardImage cardImgHand) {
		getPlayerImgHand().add(cardImgHand);
	}

	public GamePlayPlayerHand getGPPH() {
		return GPPH;
	}
	
}
