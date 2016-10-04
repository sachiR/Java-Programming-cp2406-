import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        String userName = showWelcome();//username
        while (true){
            showMenu();
            int opt = getUserMenuChoice(1,3);
            switch (opt){ //options in the menu
                case 1:
                    startNewGame();
                    break;
                case 2:
                    howToPlay();
                    break;
                case 3:
                    System.out.println("Thank you for playing "+userName+", Come Again..");
                    System.exit(opt); //exit the game
            }
        }

    }

    private static void startNewGame() throws ParserConfigurationException, SAXException, IOException {
        int numOfPlayers = getNumOfPlayers();
        STGame game = new STGame(numOfPlayers, new STDeck());
        for (int i = 0; i < game.getDeck().getCards().size(); i++) {
            game.getDeck().printCardAndProperties(game.getDeck().getCards().get(i));
        }

        game.getDeck().ShuffleTheDeck();
        game.DealCardsToEachPlayer(8);
        game.printNextPlayer();

        while (true) {
            boolean exitFlag = false;
            if (game.nextPlayerID == 0){
                System.out.println("1.  Play a Card");
                System.out.println("2.  Show all Card in my Hand");
                System.out.println("3.  Draw a Card from the Deck");
                System.out.println("4.  Exit Current Game");
            } else{
                System.out.println("1.  Play the Next players card");
            }

            int opt = getUserMenuChoice(1, 4);

            switch (opt) { //options in the menu
                case 1:
                    game.playCard(game.nextPlayerID);
                    game.printNextPlayer();
                    STCard card = game.compareCard(game.nextPlayerID,game.getLastPlayedCard(),game.comapareCategory());
                    break;
                case 2:
                    //ShowAllCardsInHand();
                    for (STCard scard : game.getPlayers().get(0).getCardsInHand()){
                        game.getDeck().printCardAndProperties(scard);
                        System.out.println("");
                    }
                    break;
                case 3:
                    int np = game.nextPlayerID;
                    int plid = game.getPlayers().get(np).getPlayerID();

                    STCard c =  game.drawCardFromDeck(plid);
                    if(c != null){
                        game.getDeck().printCardAndProperties(c);

                    }
                    System.out.println("");
                    break;
                case 4:
                    exitFlag = true;
                    break;
            }
            if (exitFlag) {
                break;
            }
        }
    }


    private static int getNumOfPlayers() {
        System.out.println("Enter the number of players... (3 to 5)");
        int a = getUserMenuChoice(3,5);
        return a;
    }

    private static void howToPlay() {
        System.out.println("About Mineral Super-trumps: \nMineral Super-trumps is a game designed to help players learn about the properties and uses of common rock forming minerals." +
                "The pack is consistent of 54 mineral cards and 6 \nsuper-trump cards. Each mineral car includes information about the respective mineral.while" +
                "the first three playing categories relate to distinct physical properties of the mineral, \nthe last two categories rate importance of the mineral in " +
                "term of abundance in the Earths crust(continental and oceanic) and value to modern societies.");
        System.out.println("\nObjective: \nto be the first player to lose all of your cards");
        System.out.println("\nHow to play: \n " +
                "1. Randomly chosen dealer shuffles and deal 8 cards each.each player can look at their cards but cannot look at others." +
                "the remaining card pack is placed down on the table.\n " +
                "2. The player on the left of the dealer goes first placing a mineral card. The Player" +
                "must state the mineral nam, one of the five categories(i.e.Hardness,Specific Gravity....) and \nthe top value of that category.\n" +
                "e.g. Glaucophane, Specific Gravity, 3.2 \n " +
                "3. Next player is the one left to the last player.He/she must play a card that has a higher value in the playing category than the played card.\n " +
                "4. If a player does not have a mineral card with a higher value or trump being played, then player must pass and pick up one card from the " +
                "deck. The player then cannot play again\n until all but one player has passed, or until another player throws a super-trump card to change thr trump" +
                "category. A player is allowed to pass even if they\n still hold cards that could be played.\n " +
                "5. If the player has a super-trump card they may play this at any of their turns. By placing a super-trump card, the player changed the playing category " +
                "or trump according to \nthe instructions on the card. At this stage any player who passed on previous round is now able to play again. \n " +
                "NOTE: If a Player throws The Geophysicist card with the Magnetite card, they win the hand.\n " +
                "6. The game continues players taking turns until all but one player has passed. The last player then gets to lead out the next round and chooses the trump" +
                "category to be played.\n " +
                "7. The winner of the game is the first player to lose all of their cards. The game continue until all but one player has lost their cards.\n\n ");
    }

    private static int getUserMenuChoice(int min, int max) {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        String line = reader.nextLine (); // Scans the next token of the input as an int.
        int n;
        while (true) {//check if it is true and continue while it is
            if (line.length () == 1) { // check the line lengt
                try {
                    n = Integer.parseInt(line); //change n to a int/
                    if (n < min || n > max) {
                        System.out.println("Invalid choice please select again");
                    } else {
                        break;
                    }
                }
                catch (NumberFormatException e) { // an exception is thrown
                    System.out.println(e.getMessage() + " Invalid choice please select again");// print an error message
                }
            }
            line = reader.nextLine (); // read the next line
        }
        return n;
    }
    private static void showMenu() {
        //CLEAR SCREEN ===
        System.out.println("Press 1 to start game"); // shows menu with 3 options
        System.out.println("Press 2 to how to play the game");
        System.out.println("Press 3 to quit game");
    }

    private static String showWelcome() {
        System.out.println("Welcome to Mineral Super Trumps Game \nPlease enter your Name..."); // shows welcome message and gets user name
        Scanner reader = new Scanner(System.in); // Reading from System.in
        return reader.next();
    }
}
