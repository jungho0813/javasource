package lang;

public class Card {
	String Kind;
	int number;
	
	public Card() {
		this("SPADE",1);
	}
	
	public Card(String kind, int number) {
		super();
		Kind = kind;
		this.number = number;
	}
//	@Override
//	public String toString() {
//		return "kind : "+kind+", number : "+number;
//	}

	@Override
	public String toString() {
		return "Card [Kind=" + Kind + ", number=" + number + "]";
	}

}
