
public class Card {

	String suit;
	String rank;

	// Constructor
	Card(String st, String rk) {
		this.suit = st;
		this.rank = rk;
	}

	// Method: Display card
	String DisplayCard() {
		return rank + suit.charAt(1);
	}

//	public static void main(String[] args) {
//		Card c = new Card("Heart", "A"); 
//		System.out.println(c.DisplayCard()); 
//		
//	}

}
