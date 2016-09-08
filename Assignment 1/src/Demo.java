import javax.swing.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        showWelcome();
        showMenu();
    }

    private static void showWelcome(){
        System.out.println("Welcome To Mineral Supertrumps\n" +
                "Please Enter Your Name...");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
    }

    private static void showMenu(){
        System.out.println("1 - continue");
        System.out.println("2 - exit");
        System.out.println("3 - How To Play");
        Scanner input = new Scanner(System.in);
        int menuOption = Integer.parseInt(input.nextLine());
    }

}
