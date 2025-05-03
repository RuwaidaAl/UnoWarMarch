//Author: Ruwaida Al Harrasi
/*a driver class with a main method that reports the win-rate for every possible
pair of AIs
 */
public class Tournament {
    //print the win rate of every pair of AIs
    public static void main(String[] args) {
        AI[] ai = {new AI(), new BiggestCardAI(), new SmallestCardAI()};
        for (AI ai1 : ai) {
            for (AI ai2 : ai) {
                UnoWarMatch unoWarmatch = new UnoWarMatch(ai1, ai2);
                System.out.println(ai1 + " vs. " + ai2+" "+ unoWarmatch.winRate(1000)) ;
            }
        }
    }
}
