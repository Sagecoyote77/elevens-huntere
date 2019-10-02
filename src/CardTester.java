/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
                
                /* *** CARD 1 *** */
                System.out.println( "\nCARD 1 test" );
                Card x = new Card("King", "clubs", 13 );
                System.out.println( "My card is ranked: " + x.rank() );
                System.out.println( "My card has the suit: " + x.suit() );
                System.out.println( "My card has the value: " + x.pointValue() );
                /* *** CARD 2 *** */
                System.out.println( "\nCard 2 test" );
                Card y = new Card("King", "clubs", 13 );
                System.out.println( "My card is ranked: " + y.rank() );
                System.out.println( "My card has the suit: " + y.suit() );
                System.out.println( "My card has the value: " + y.pointValue() );
                System.out.println( "This should be true: " + x.matches(y) );
                /* *** CARD 3 *** */
                System.out.println( "\nCARD 3 test" );
                Card z = new Card("zorgon", "purple", 800);
                System.out.println( "My card is ranked: " + z.rank() );
                System.out.println( "My card has the suit: " + z.suit() );
                System.out.println( "My card has the value: " + z.pointValue() );
	}
}
