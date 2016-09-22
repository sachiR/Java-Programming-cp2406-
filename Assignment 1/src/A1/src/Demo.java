import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        showWelcome();
        showMenu();
        int opt = getUserMenuChoice();
        System.out.println(opt);
    }

    private static int getUserMenuChoice() {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        String line = reader.nextLine (); // Scans the next token of the input as an int.
        int n;
        while (true) {
            if (line.length () == 1) {
                try {
                    n = Integer.parseInt (line);
                    break;
                }
                catch (NumberFormatException e) {
                    // do nothing.
                }
            }
            System.out.println ("Invalid choice please select again");
            line = reader.nextLine ();
        }

        if (n < 1 || n > 3){ // if statement to check if the input is between 1 and 3
            do {System.out.println("Invalid choice please select again");
                n = reader.nextInt();}
            while (n < 1 || n > 3 );

        } else {
            return n;
        }
        return n;
    }

    private static void showMenu() {
        System.out.println("Press 1 to start game");
        System.out.println("Press 2 to see how to play the game");
        System.out.println("Press 3 to quit game");
    }

    private static  void showWelcome(){
        System.out.println("Welcome to Mineral Trumps"); // shows welcome message
    }
}
