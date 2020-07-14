package CardTypes.Unicorns;


public class Baby extends Unicorn {
		static String desc = "If this card would be sacrificed, destroyed, or returned to your hand, return it to the Nursery instead.";
		public Baby(String color) {
			this.setCardName("Baby Unicorn "+color);
			this.setCardDescription(desc);
			this.setCardImage(color);
		}
		
}
