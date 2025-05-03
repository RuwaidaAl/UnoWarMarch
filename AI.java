//Author: Ruwaida Al Harrasi
public class AI {
    /*
     takes two parameters, the hand, full of cards the AI is allowed to play, and the
     cardPile that the AI is playing on.
     */
    public Card getPlay(Hand hand, CardPile cardPile) {

        //pick the first card in the hand that is valid
        for (int i = 0; i < hand.getSize(); i++) {
            if (cardPile.canPlay(hand.get(i))) {

                return hand.get(i);
            }

        }
        return null;

    }
    //return the name of the AI.
        public String toString(){
            return "Random Card AI";

        }

    }

