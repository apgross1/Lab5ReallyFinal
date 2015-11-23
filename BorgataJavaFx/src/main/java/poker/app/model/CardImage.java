package poker.app.model;
import enums.eRank;
import enums.eSuit;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import pokerBase.Card;

public class CardImage extends Card {
	private HBox hBox;
	private int imgNbr;
	private Card card;
	private Image cardImage;
	
	public Image getCardImage() {
		return cardImage;
	}


	public void setCardImage(Image cardImage) {
		this.cardImage = cardImage;
	}


	public CardImage(Card c, HBox hBox, int imgNbr) {
		sethBox(hBox);
		setImgNbr(imgNbr);
		setCard(c);
	}
	

	public HBox gethBox() {
		return hBox;
	}

	public void sethBox(HBox hBox) {
		this.hBox = hBox;
	}

	public int getImgNbr() {
		return imgNbr;
	}

	public void setImgNbr(int imgNbr) {
		this.imgNbr = imgNbr;
	}


	public Card getCard() {
		return card;
	}


	public void setCard(Card card) {
		this.card = card;
	}
}
