import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HandTest {

    Hand testHand;
    Card card;
    Deck deck;

    @Before
    public void before() {
        testHand = new Hand();
        card = new Card(Suit.SPADES, Rank.ACE);
        deck = new Deck();

    }

   @Test
   public void handCount(){

        assertEquals(0, testHand.handCount());

   }

    @Test
    public void canAddCard(){
        Card card = new Card(Suit.SPADES, Rank.ACE);
        testHand.addCard(card);
        assertEquals(1, testHand.handCount());
    }

    @Test
    public void takeCardFromDeck(){
        testHand.takeCardFromDeck(deck);
        assertEquals(1, testHand.handCount());
    }

    @Test
    public void removeCardFromHand(){
        testHand.addCard(card);
        testHand.removeCardFromHand();
        assertEquals(0, testHand.handCount());
    }

}


