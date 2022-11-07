
/**
 * War game class
 *
 * @author Mr. Jaffe
 * @version 2022-10-19
 */
public class War
{
    Deck[] players;
    
    /**
     * Constructor for the game
     * Include your initialization here -- card decks, shuffling, etc
     * Run the event loop after you've done the initializations
     */
    public War()
    {
        // Initializations here...
        Deck deck = new Deck();
        deck.initializeNewDeck();
        deck.shuffle();
        players = deck.dealDeck();

        // ...then run the event loop
        this.runEventLoop();
    }
    
    /**
     * This is the game's event loop. The code in here should come
     * from the War flowchart you created for this game
     */
    public void runEventLoop() {
        System.out.print("The war has begun");
        
        Card player1Card = players[0].dealCardFromDeck();
        Card player2Card = players[1].dealCardFromDeck();
        if (player1Card.getRank() > player2Card.getRank()){
            players[0].addCardToDeck(player1Card);
            players[0].addCardToDeck(player2Card);
            
        }
        else if (player2Card.getRank()> player1Card.getRank()){
            players[1].addCardToDeck(player2Card);
            players[1].addCardToDeck(player1Card);
            
        }
        else if(player1Card.getRank()= player2Card.getRank()){
            
        }
        
        
    

    }
    
    /**
     * The main method is called when Java starts your program
     */
    public static void main(String[] args) {
        War war = new War();
    }

}
