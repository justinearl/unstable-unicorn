package GameItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import CardTypes.Unicorns.Baby;

public class Nursery implements Collection<Card>{
	private List<Card> babyCards = new ArrayList<Card>();
	
	public Nursery() {
		List<Card> baby = new ArrayList<Card>();
		
		baby.add(new Baby("Black"));
		baby.add(new Baby("Blue"));
		baby.add(new Baby("Brown"));
		baby.add(new Baby("Death"));
		baby.add(new Baby("Green"));
		baby.add(new Baby("Orange"));
		baby.add(new Baby("Pink"));
		baby.add(new Baby("Purple"));
		baby.add(new Baby("Rainbow"));
		baby.add(new Baby("Red"));
		baby.add(new Baby("Yellow"));
		baby.add(new Baby("White"));
		
		this.setBabyCards(baby);
	}
	
	public void show() {
		for(Card cards : this.babyCards) {
			System.out.println(cards);
		}
	}

	public List<Card> getBabyCards() {
		return babyCards;
	}

	public void setBabyCards(List<Card> babyCards) {
		this.babyCards = babyCards;
	}
	
	public static void main(String[] args) {
		Nursery x = new Nursery();
		x.show();
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
