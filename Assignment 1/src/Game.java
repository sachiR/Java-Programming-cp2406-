public class Game {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.showCards();
        myDeck.shuffle();
        myDeck.showCards();
    }

}