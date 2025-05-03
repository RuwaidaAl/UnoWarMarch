//Author: Ruwaida Al Harrasi
/*
 represents a single playing card
  */
public class Card {

    private int rank,suit;


    //array to store rank names
    String[] rankName = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", " Nine", "Ten", "Jack", "Queen", "King"};
    //array to store  suit names
    String[] suitName = {"Spades", "Hearts", "Clubs", "Diamonds"};

    public Card(int rank, int suit) {

        if (rank<0 || rank>14 || suit<0 || suit>4){
            System.out.println("Invalid Card");
        }
        else{
            this.rank=rank-1;
            this.suit=suit-1;
        }
    }
    //This method should return the number representation of the cards rank.
    public int getRankNum() {
        return rank+1;
    }
    public int getSuitNum() {
        return suit+1;
    }
    //This method should return the string naming the cards rank.
    public String getRankName(){
        return rankName[rank];
    }
    //This method should return the string naming the cards suit.
    public String getSuitName()
    {
        return suitName[suit];
    }

    public String toString(){
        return getRankName() + " of "+ getSuitName() ;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (obj instanceof Card)
        {
            Card card = (Card) obj;
            return this.getRankNum() == card.getRankNum() &&
                    this.getSuitName().equals(card.getSuitName());
        }
        else
        {
            return false;
        }
    }
}