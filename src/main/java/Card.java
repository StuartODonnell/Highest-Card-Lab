public class Card {

//property
    private Suit suit;
    private Rank rank;

//constructor Command N for autofill

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
//    getters Command N for autofill


    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValueFromEnum(){
        return rank.getValue();
    }
}
