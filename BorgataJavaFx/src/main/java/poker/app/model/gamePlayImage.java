package poker.app.model;

import java.util.ArrayList;

import pokerBase.GamePlay;
import pokerBase.GamePlayPlayerHand;
import pokerBase.Player;

public class gamePlayImage {
	private GamePlay gamePlay;
	private ArrayList<GPPHImage> GamePlayerImage = new ArrayList<GPPHImage>();
	private GPPHImage GameCommonHand;
	
	
	public ArrayList<GPPHImage> getGamePlayerImage() {
		return GamePlayerImage;
	}

	public void setGamePlayerImage(ArrayList<GPPHImage> gamePlayerImage) {
		GamePlayerImage = gamePlayerImage;
	}

	public void setGameCommonHand(GPPHImage gch) {
		GameCommonHand = gch;
	}
	
	public GPPHImage getGameCommonHand() {
		return GameCommonHand;
	}


	public gamePlayImage() {
		
	}
	
	public gamePlayImage(GamePlay gme) {
		gamePlay = gme;
	}
	
	public void addGPPHImage(GPPHImage gpphimage) {
		GamePlayerImage.add(gpphimage);
	}
	public GPPHImage FindPlayerGame(GamePlay gme, Player p)
	{
		GPPHImage GPPHImageReturn = null;
		
	
		for (GPPHImage GPPH: GamePlayerImage)
		{
			if (p.getiPlayerPosition() == GPPH.getGPPH().getPlayer().getiPlayerPosition())
			{
				GPPHImageReturn = GPPH;
			}
		}
		return GPPHImageReturn;
	}
}
