import java.util.ArrayList;

import java.util.Collections;

public class Deck {

    private ArrayList<Card> card;
    public Hand hand;
    public Deck deck;



    public Deck(){
        this.card = new ArrayList<>();
        populateDeck();
        shuffleDeck();
    }
// Nested loop. this will loop through every suit, and for each
// suit will loop through each rank and return each combination.

    public void populateDeck(){
        for (Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                Card card = new Card(suit, rank);
                this.card.add(card);
            }
        }

    }
    public int getNumberOfCards(){
        return this.card.size();

    }

    private void shuffleDeck(){
        Collections.shuffle(this.card);
    }

    public Card removeCard(){
        return this.card.remove(0);
    }

//    public Deck getCardFromDeck(){
//        Card card = deck.removeCard();
//        return this.hand.add(card);
//    }
}
