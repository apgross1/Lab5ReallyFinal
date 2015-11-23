package pokerEnums;

public enum eHandStrength {

	FiveOfAKind(110){
		public String toString()
		{
			return "Five of a Kind";
		}
	},
	RoyalFlush(100){
		public String toString()
		{
			return "Royal Flush";
		}
	},
	StraightFlush(90){
		public String toString()
		{
			return "Straight Flush";
		}
	},
	FourOfAKind(80){
		public String toString()
		{
			return "Four of a Kind";
		}
	},
	FullHouse(70){
		public String toString()
		{
			return "Full House";
		}
	},
	Flush(60){
		public String toString()
		{
			return "Flush";
		}
	},
	Straight(50){
		public String toString()
		{
			return "Straight";
		}
	},
	ThreeOfAKind(40){
		public String toString()
		{
			return "Three of a Kind";
		}
	},
	TwoPair(30){
		public String toString()
		{
			return "Two Pairs";
		}
	},
	
	Pair(20){
		public String toString()
		{
			return "One Pair";
		}
	},
	HighCard(10){
		public String toString()
		{
			return "High Card";
		}
	};
	
	private eHandStrength(final int handstrength){
		this.iHandStrength = handstrength;
	}

	private int iHandStrength;
	
	public int getHandStrength(){
		return iHandStrength;
	}
	
	public static eHandStrength getStrength(int i) {
		switch(i) {
		case(10):
			return eHandStrength.HighCard;
		case(20):
			return eHandStrength.Pair;
		case(30):
			return eHandStrength.TwoPair;
		case(40):
			return eHandStrength.ThreeOfAKind;
		case(50):
			return eHandStrength.Straight;
		case(60):
			return eHandStrength.Flush;
		case(70):
			return eHandStrength.FullHouse;
		case(80):
			return eHandStrength.FourOfAKind;
		case(90):
			return eHandStrength.StraightFlush;
		case(100):
			return eHandStrength.RoyalFlush;
		case(110):
			return eHandStrength.FiveOfAKind;
		}
		return eHandStrength.Pair;
	}
	
	
}
