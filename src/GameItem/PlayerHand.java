package GameItem;

import java.util.ArrayList;
import java.util.List;

public class PlayerHand {
	private List<Card> cardOnHand = new ArrayList<Card>();
	private String name;

	public PlayerHand(List<Card> draw, String name) {
		this.setName(name);
		this.setCardOnHand(draw);
	}
	
	public void show() {
			for(Card card : this.getCardOnHand()) {
				System.out.println(this.getName()+card);
			}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCardOnHand() {
		return cardOnHand;
	}

	public void setCardOnHand(List<Card> cardOnHand) {
		this.cardOnHand = cardOnHand;
	}
	

}
