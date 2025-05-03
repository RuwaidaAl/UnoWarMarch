//Author: Ruwaida Al Harrasi
public class BiggestCardAI extends AI{
  // return the biggest-rank valid card in the hand
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card  biggest =null;
        int sizeHand = hand.getSize();
        for (int i = 0; i <sizeHand; i++) {
            if ( cardPile.canPlay(hand.get(i)) )
            {
                if (biggest == null){
                    //swap
                    biggest =hand.get(i);
                }
                else if(hand.get(i).getRankNum()> biggest.getRankNum()){
                //swap
                biggest = hand.get(i) ;
            }
            }
        }
        return biggest ;
    }
    //return the name of the AI.
    public String toString(){
        return "Biggest Card AI";
    }

}




