import java.util.Arrays;
//Author: Ruwaida Al Harrasi
//s represents a hand full of cards
public class Hand {
   private final Deck deck1;
   private final int size;
   private final Card [] hand;

    /*
    This Constructor will create an array to store cards of the given size, and then draw it
    full of cards using the supplied deck
     */
    public Hand(Deck deck, int size) {


        this.deck1=deck;
        this.size = size;
        this.hand= new Card[size];
        for ( int i=0; i<size; i++){
            if(!deck.isEmpty()){
                hand[i]=deck.draw();
            }
        }
    }

    //Get the size of the hand
    public int getSize(){
            return size;
        }


    //Get the card at the given index in this hand
    public Card get(int i) {

        /*if an index is given that is out of bounds this method
        will print an error
         */
        if(i<0 || i>size){
            System.out.println("Invalid hand index!");
            //and then return the first card
            return hand[0];
        }
        else{
            return hand[i];
        }

    }
    // remove a given card from the hand.
    public boolean remove(Card card) {
        int index = findInt(card);

        //If the card is not found in the hand it returns false
        if (index == -1) {
            return false;
        }

        //If the card is found in the hand it should be removed
        else {
            card = hand[index];
            hand[index ]= deck1.draw();
            return true;
        }
    }
    // check if i in hand
    private int findInt( Card card){
        for(int i=0; i<size; i++) {
            if (card.equals(hand[i])) {
                return i;
            }
        }
        return -1;
    }

    }


