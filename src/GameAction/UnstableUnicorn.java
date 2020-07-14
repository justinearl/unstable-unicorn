package GameAction;

import GameItem.*;

public class UnstableUnicorn {
	private Deck deck = new Deck();
	private Nursery babyUnicorn = new Nursery();
	private DiscardPile discarded = new DiscardPile();
	private PlayerHand[] cardOnHand = {new PlayerHand(deck.drawCard(5), "Player1"), new PlayerHand(deck.drawCard(5), "Player2")};
	private Stable unicornTable = new UnicornField();
	private Stable powerTable = new PowerField();
	private Stable instantField = new InstantField();
	private BanishZone banishField = new BanishZone();
	
	public UnstableUnicorn() {
		
		deck.show();
		
		Player[] player = {new Player(cardOnHand[0]), new Player(cardOnHand[1])};
		
		
		int i = 0;
		Turn phase;
		do {
			
			phase = new Turn(player[i]);
			//cardOnHand[i].show();
			
			//System.out.println(i);
			
			if(i > 0) {
				i--;
			}else {
				i++;
			}
			
			
		} while (phase.turnCheck());
		
	}
	
	public static void main(String[] args) {
		new UnstableUnicorn();
	}
	

}
