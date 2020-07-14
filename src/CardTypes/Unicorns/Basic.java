package CardTypes.Unicorns;

public class Basic extends  Unicorn{
	static String desc = "If this card would be sacrificed, destroyed, or returned to your hand, return it to the Nursery instead.";
	public Basic(String color) {
		this.setCardName("Basic Unicorn "+color);
		this.setCardDescription(desc);
		this.setCardImage(color);
	}

}
