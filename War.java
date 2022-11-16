
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
        for (int  c = 0; c <= 300 ; c++){
            Card player1Card = players[0].dealCardFromDeck();
            Card player2Card = players[1].dealCardFromDeck();
            System.out.println("players count your decks!");

            if (players[0].getDeckSize() ==0 ){
                System.out.println("Player 2 wins the war");

            }
            else if (players[1].getDeckSize() ==0 ) {
                System.out.println("Player 1 wins the war");

            }
            else{

                if (player1Card.getRank() > player2Card.getRank()){
                    players[0].addCardToDeck(player1Card);
                    players[0].addCardToDeck(player2Card);
                    System.out.println("player 1 wins");

                }
                else if (player2Card.getRank()> player1Card.getRank()){
                    players[1].addCardToDeck(player2Card);
                    players[1].addCardToDeck(player1Card);                                   
                    System.out.println("player 2 wins");

                }
                else {
                    if (players[0].getDeckSize() <=3 ){

                        System.out.println("player 2 wins the war by defalt");

                    }
                    else if (players[1].getDeckSize() <=3 ) {

                        System.out.println("player 2 wins the war by defalt");

                    }
                    else{
                        System.out.println("All out War!");

                        Deck deckWar = new Deck();
                        deckWar.addCardToDeck(player1Card);
                        deckWar.addCardToDeck(player2Card);

                        for(int i = 0; i<4; i++){
                            if (players[0].getDeckSize() ==0 ){
                                System.out.println("Player 2 wins the war");

                            }
                            else if (players[1].getDeckSize() ==0 ) {
                                System.out.println("Player 1 wins the war");

                            }
                            player1Card = players[0].dealCardFromDeck();
                            player2Card = players[1].dealCardFromDeck();
                            deckWar.addCardToDeck(player1Card);
                            deckWar.addCardToDeck(player2Card);

                        }

                        player1Card = players[0].dealCardFromDeck();
                        player2Card = players[1].dealCardFromDeck();

                        if (player1Card.getRank() > player2Card.getRank()){
                            players[0].addCardToDeck(player1Card);
                            players[0].addCardToDeck(player2Card);
                            Card  wins;
                            for (int i=0; i<4;i++){
                                wins = deckWar.dealCardFromDeck();
                                players[0].addCardToDeck(wins);
                            }
                            System.out.println("player 1 wins the war");

                        }
                        else if(player2Card.getRank()>player1Card.getRank()){
                            players[1].addCardToDeck(player2Card);
                            players[1].addCardToDeck(player1Card);
                            Card  wins;
                            for (int i=0; i<4;i++){
                                wins = deckWar.dealCardFromDeck();
                                players[1].addCardToDeck(wins);

                            }
                            System.out.println("player 2 wins the war");

                        }
                    }
                }
                if (players[0].getDeckSize() ==0 ){
                    System.out.println("Player 2 wins the Game");

                }
                else if (players[1].getDeckSize() ==0 ) {
                    System.out.println("Player 1 wins the Game");

                }

            }
        }
    }

    /**
     * The main method is called when Java starts your program
     */
    public static void main(String[] args) {
        System.out.print("\u000C");
        War war = new War();
    }

}
