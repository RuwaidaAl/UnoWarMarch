//Author: Ruwaida Al Harrasi
/*
  represents the pile of cards that players play onto, and is where several
  of the rules of the game are implemented.
  */
public class CardPile {
    private Card topCard;
    private int NumCards;

    //create a new card pile with the given card
    public CardPile(Card topCard){
        this.topCard =  topCard ;
        this.NumCards =1;

    }
    //check if the input card is legal to play on the current stack
    public boolean canPlay(Card card){
        if (card == null){
            return false;
        }
        //a card can be played if it has a higher rank than the current top card,
        if(card.getRankNum()>= topCard.getRankNum()){
                return true;
        }
        // a card can b played if it has the same suit as the top card
        if(card.getSuitNum()==topCard .getSuitNum()){
            return true;
        }
       else{
           return false;
        }
    }
    //This method will add another card to the card pile
    public void play(Card card) {
        if (canPlay(card)) {
            NumCards++;
            topCard = card;
        } else {
            //If the input card is not legal to play on the top of the card pile
            // print an error message
            System.out.println("Illegal move detected!");
        }

    }
    //Gets the number of cards in the CardPile.
    public int getNumCards(){
        return NumCards;
    }
    //Gets the current top card for this CardPile
    public Card getTopCard(){
        return topCard;
    }

}
