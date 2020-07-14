package GameItem;


public abstract class Card {
	private String cardName;
	private String cardDescription;
	private String cardImage;
	
	public Card() {
		
	}
	
	public Card(String name, String desc, String img) {
		this.setCardDescription(desc);
		this.setCardImage(img);
		this.setCardName(name);
	}
	
	
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardDescription() {
		return cardDescription;
	}
	public void setCardDescription(String cardDescription) {
		this.cardDescription = cardDescription;
	}

	public String getCardImage() {
		return cardImage;
	}

	public void setCardImage(String cardImage) {
		this.cardImage = cardImage;
	}

	@Override
	public String toString() {
		return "Card [cardName=" + cardName + "]";
	}

	

	
	
	
	
	
}
