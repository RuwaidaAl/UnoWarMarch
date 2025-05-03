//Author: Ruwaida Al Harrasi
/*This class represents a match-up of two AIs at UnoWar
(one match-up may be settled by thousands of actual games,
this object handles both single games, and multiple game series)
 */

public class UnoWarMatch {
    private AI ai1;
    private AI ai2;

    //This constructor This takes the two AIs that this
    // UnoWarMatch class isintended to compare.
    public UnoWarMatch(AI ai1, AI ai2) {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    //Play a single game of Uno War and returns value should be
    // true if ai1 wins, and false if ai2 wins
    public boolean playGame() {
       int point1 = 0;
       int point2 = 0;
       boolean turn =true;
       Deck deck = new Deck();
       deck.shuffle();
       Hand hand1 = new Hand(deck, 5);
       Hand hand2 = new Hand(deck, 5);
        //deal a card to start the card pile in the middle
       Card topCard = deck.draw();
       CardPile cardpile = new CardPile(topCard );
       while (point1 < 10 && point2 < 10) {

        if (turn ) {
            Card cardPlay = ai1.getPlay(hand1, cardpile);
            if (cardpile.canPlay(cardPlay)) {
                cardpile.play(cardPlay );
                hand1.remove(cardPlay);
            } else {
                 /*if player does not have a valid card then the other player will
                 get a point and play next
                  */
                point2++;
                cardpile = new CardPile(deck.draw());

            }
        }

        else {
            Card cardPlay2 = ai2.getPlay(hand2, cardpile);
            if (cardpile.canPlay(cardPlay2)) {
                cardpile.play(cardPlay2);
                hand2.remove(cardPlay2);
            }
            else {
                /*if player does not have a valid card then the other player will
                 get a point and play next
                  */
                point1++;
                cardpile = new CardPile(deck.draw());
            }

        }
        turn = !turn;
    }
        // if ai1 has 10 points then it will return true
        if( point1 == 10){
            return true;
        }
        else{
            return false;
        }
}
    /*
    This method should report the percent of times AI 1
    beat AI2 as a double
     */
    public double winRate(int nTrials) {
        int  win = 0;
        for (int i = 0; i < nTrials; i++) {
            if (playGame()) {
                win++;
            }
        }
        return 1.0*win  / nTrials;
    }

}