package GameItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


import CardTypes.Downgrade.*;
import CardTypes.Instant.*;
import CardTypes.Magics.*;
import CardTypes.Upgrade.*;
import CardTypes.Unicorns.Basic;


public class Deck implements Collection<Card>{

	private List<Card> deckOfCards = new ArrayList<Card>();
	
	public Deck() {
		List<Card> cardList = new ArrayList<Card>();
		
		//Downgrade Cards
		cardList.add(new BarbedWire());
		cardList.add(new BlindingLight());
		cardList.add(new BrokenStable());
		cardList.add(new NannyCam());
		cardList.add(new Pandamonium());
		cardList.add(new SadisticRitual());
		cardList.add(new Slowdown());
		cardList.add(new TinyStable());
		//Upgrade Cards
		
		for (int i = 0; i < 3; i++) {
			cardList.add(new ExtraTail());
			cardList.add(new RainbowMane());
		}
		for (int i = 0; i < 2; i++) {
			cardList.add(new GlitterBomb());
			cardList.add(new Yay());
		}
		
		cardList.add(new RainbowAura());
		cardList.add(new DoubleDutch());
		cardList.add(new SummoningRitual());
		cardList.add(new UnicornLasso());
		
		for (int i = 0; i < 14; i++) {
			//Instant Cards
			cardList.add(new Neigh());
		}
		cardList.add(new SuperNeigh());
		//Magic Cards
		for (int i = 0; i < 3; i++) {
			cardList.add(new BackKick());
			cardList.add(new UnicornPoison());
		}
		
		for (int i = 0; i < 2; i++) {
			cardList.add(new ChangeofLuck());
			cardList.add(new GlitterTornado());
			cardList.add(new UnicornSwap());
			cardList.add(new ReTarget());
			cardList.add(new UnfairBargain());
			cardList.add(new TwoForOne());
		}
		
		cardList.add(new BlatantThievery());
		cardList.add(new GoodDeal());
		cardList.add(new MysticalVortex());
		cardList.add(new ResetButton());
		cardList.add(new ShakeUp());
		cardList.add(new TargetedDestruction());
		cardList.add(new UnicornShrinkray());
		
		//Basic Unicorn Cards
		cardList.add(new Basic("Narwhal"));
		for (int i = 0; i < 3; i++) {
			cardList.add(new Basic("Blue"));
			cardList.add(new Basic("Green"));
			cardList.add(new Basic("Indigo"));
			cardList.add(new Basic("Orange"));
			cardList.add(new Basic("Purple"));
			cardList.add(new Basic("Yellow"));
			cardList.add(new Basic("Cyan"));
			
		}
		//Magical Unicorn Cards
		
		Collections.shuffle(cardList);
		
		this.setDeckOfCards(cardList);
	}
	
	public void show() {
		for(Card cards : this.deckOfCards) {
			System.out.println(cards);
		}
	}
	
	public  List<Card> drawCard(int count) {
		List<Card> draws = new ArrayList<Card>();
		for(int i = 0; i < count; i++) {
			
			draws.add(this.deckOfCards.remove(0));
			
		}
		return draws;
	}
	
	@Override
	public String toString() {
		return "Deck [deckOfCards=" + deckOfCards + "]";
	}


	public List<Card> getDeckOfCards() {
		return deckOfCards;
	}
	public void setDeckOfCards(List<Card> deckOfCards) {
		this.deckOfCards = deckOfCards;
	}

	@Override
	public boolean add(Card e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Card> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
