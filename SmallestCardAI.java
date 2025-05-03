//Author: Ruwaida Al Harrasi
public class SmallestCardAI extends AI {

    // return the smallest-rank valid card in the hand
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card smallest = null;
        int sizeHand = hand.getSize();
        for (int i = 0; i < sizeHand; i++) {
            if (cardPile.canPlay(hand.get(i))) {

                if (smallest == null ) {
                    //swap
                    smallest = hand.get(i);
                }
                else if (hand.get(i).getRankNum() < smallest.getRankNum()) {
                    //swap
                    smallest = hand.get(i);
                }

            }
        }
        return smallest;
    }   //return the name of the AI
        public String toString(){
                return "Smallest Card AI";
        }

    }


