/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/** 
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                /**** Example Deck 1 ****/
                //reusable assesets
                String[] suits = {"clubs", "hearts", "diamonds", "spades"};
                String[] ranks = {"ace", "two", "three", "four", "five", 
                    "six", "seven", "eight", "nine", "ten", "jack", "queen", 
                    "king"};
                int[] pointvalues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
                /*
                //new assets
                String[] benders = {"earth", "air", "fire", "water"};
                String[] powerLevel = {"I", "II", "III", "IV", "V", "VI", "VII", 
                    "VIII", "IX", "X", "XI", "XII", "XIII"};
                int[] levelValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
                */
                System.out.println( "----TESTING DECK 1----" );
                //create a deck
                Deck dMoney = new Deck(ranks, suits, pointvalues);
                //test its size
                System.out.println( "deck size:" + dMoney.size() );
                
                //deal one card
                Card x = dMoney.deal();
                System.out.println( "Delt this card: " + x );
                System.out.println( "Now my deck size is:" + dMoney.size() );
                
                //test two String 
                System.out.println( dMoney );
                
                /**** Example Deck 2 ****/
                /*
                System.out.println( "----TESTING DECK 2----" );
                //create a deck
                Deck avatar = new Deck( powerLevel, benders, levelValues);
                //test its size
                System.out.println( "Deck size: " + avatar.size() );
                //deal until empty
                while( !avatar.isEmpty() ){
                    avatar.deal();
                }
                System.out.println( avatar );
                */
	}
}

