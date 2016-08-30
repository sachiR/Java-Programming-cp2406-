import javax.swing.*;
import java.lang.*;

public class App {

    public static void main(String [] args) {
        JOptionPane option = new JOptionPane();
        JFrame frame = new JFrame();
        String name;
        String answer ;
        //gets the name form the user
        name = option.showInputDialog("Welcome To Mineral Supertrumps\n           Please Enter Your Name");

        //if the name is invalid it will ask again
        while(name.isEmpty()){
            name = option.showInputDialog("Try Again...\nPlease Enter Your Name");
        } //while ends

        // option to continue or not
        if (JOptionPane.showConfirmDialog(null,name+ ", Would you like to continue...", "Continue",
                option.YES_NO_OPTION) == option.YES_OPTION) {
            // yes option
        } else {
            option.showMessageDialog(null, "Thank You.."+ name+" See You Later");
            System.exit(0);
        }//else ends


    }//main() ends
}// class ends

