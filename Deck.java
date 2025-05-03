import java.util.Random;
//Author: Ruwaida Al Harrasi
//represents a deck of cards
public class Deck {

    private Card[] cards;
    private static final int defaultSize = 52;
    public  int numberDealt;

    //creates a new deck
    public Deck(){

        int count=0;
        cards = new Card[defaultSize ];
        for (int i = 1; i <=13; i++) {
            for (int j = 1; j <=4; j++) {
              cards[count]=new Card(i,j);
              count++;

            }

        }
        shuffle();
    //call your shuffle method so that all decks are shuffled by default.
    }
    //Shuffle the deck of Card’s that is represented by the card array
    public void shuffle() {
        Random r = new Random();
            // Start from the last element and swap one by one.
            for (int i = cards.length - 1; i >= 1; i--) {
                int j = r.nextInt(i + 1);
                Card temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;

            }
            numberDealt =0;
        }
    //This method draws and return the next card
    public Card draw()
    {
        if(isEmpty()){
            shuffle();
        }
        numberDealt ++;
        return cards[cardsRemaining()];
    }


    /*This method will return the number of cards remaining
    before the next reshuffle
     */
    public int cardsRemaining(){
        return defaultSize  - numberDealt;
    }

    public boolean isEmpty(){
        if(cardsRemaining() ==0){
            return true;
        }
        else{
            return false;
        }
    }

}
