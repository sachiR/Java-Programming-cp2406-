import javax.swing.*;
import java.lang.*;

public class App {

    public static void main(String [] args) {
        JOptionPane option = new JOptionPane();
        JFrame frame = new JFrame();
        String name;
        String continueProcess = new String();
        name = option.showInputDialog("Welcome To Mineral Supertrumps\n           Please Enter Your Name");
        continueProcess = option.showInputDialog(name +", Would you like to continue...\n    Y - Yes,\n    N - No");
    }
}

