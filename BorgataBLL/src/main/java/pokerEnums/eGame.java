package pokerEnums;

import java.util.ArrayList;

public enum eGame {

	FiveStud(1),
	FiveStudOneJoker(2),
	FiveStudTwoJoker(3),
	TexasHoldEm(4),
	Omaha(5),
	DeucesWild(6),
	AcesAndEights(7),
	SevenDraw(8),
	SuperOmaha(9),
	NULL(0);
	
	private int gameNbr;

	private eGame(final int gameNbr){
		this.gameNbr = gameNbr;
	}
	
	public int getGame(){
		return gameNbr;
	}
	
	public static eGame getEnum(int enumInt) {
		switch(enumInt) {
		case(1):
			return eGame.FiveStud;
		case(2):
			return eGame.FiveStudOneJoker;
			
		case(3):
			return eGame.FiveStudTwoJoker;
			
		case(4):
			return eGame.TexasHoldEm;
			
		case(5):
			return eGame.Omaha;
			
		case(6):
			return eGame.DeucesWild;
			
		case(7):
			return eGame.AcesAndEights;
	
		case(8):
			return eGame.SevenDraw;
		case(9):
			return eGame.SuperOmaha;
		}
		return eGame.NULL;
	}
}
