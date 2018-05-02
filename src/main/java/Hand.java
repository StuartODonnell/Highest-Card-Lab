import java.awt.print.Book;
import java.util.ArrayList;

public class Hand {

    public Card card;
    public Deck deck;
    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public int handCount(){
        return this.hand.size();

    }

    public void takeCardFromDeck(Deck deck){
        Card card = deck.removeCard();
        this.hand.add(card);
    }

    public void removeCardFromHand(){
        this.hand.remove(0);
    }
}
