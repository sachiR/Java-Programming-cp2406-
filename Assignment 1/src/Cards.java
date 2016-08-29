import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;


public class Cards {
    //Specifying keys of the mineral cards
    private String title, chemistry,classification,crystalSystem,occurrence,cleavage,crustalAbundance,economicValue;
    private  double hardness,specificGravity;
    private BufferedImage cardImage;

    //The constructor for Cards class
     public Cards(String title,String chemistry,String classification,String system,String occurrence,String cleavage,String abundance,String value,double hardness,double gravity, BufferedImage image){
        this.title = title;
        this.chemistry = chemistry;
        this.classification = classification;
        this.crystalSystem = system;
        this.occurrence = occurrence ;
        this.cleavage = cleavage;
        this.crustalAbundance = abundance;
        this.economicValue = value;
        this.hardness = hardness;
        this.specificGravity = gravity;
        this.cardImage = image;
    }

    //Hardness is returned
    public double Hardness(){
       return hardness;
    }// ends Hardness()

    //Specific Gravity if returned
    public double Gravity(){
        return specificGravity;
    }// ends Gravity()

    //Cleavage is returned
    public String Cleavage(){
        return cleavage;
    }//ends Cleavage()

    //Crustal Abundance is returned
    public String Abundance(){
        return crustalAbundance;
    }//ends Abundance()

    //Economic Value is returned
    public String Value(){
        return economicValue;
    }//ends Value()

    //Image of the card is returned
    public BufferedImage GetCardImage(){
        return cardImage;
    }//ends GetCardImage()

    public static void main(String args[]) throws IOException {
        // need to change occurrence to array
        Cards Quartz = new Cards("Quartz","SiO_2","tectosilicate","hexagonal","igneous,metamorphic,sedimentary","poor/none","high","moderate",7,2.65, ImageIO.read(new File("images\\Slide01.jpg")));
        Cards Plagioclase = new Cards("Plagioclase","Na Al Si_3 O_8 - Ca Al_2 Si_2 O_8","tectosilicate","triclinic","igneous,metamorphic,sedimentary","1 perfect, 1 good","very high","moderate",6-6.5,2.6-2.8,ImageIO.read(new File("images\\Slide02.jpg")));
        //create a JFrame to display the card
        JFrame window = new JFrame("Mineral Supertrumps");
        window.setSize(900,600);

        //create a JPanel
        JPanel contentPane = new JPanel(new BorderLayout());

        //create a JLabel
        JLabel cardLabel = new JLabel(new ImageIcon(Quartz.GetCardImage()));
        cardLabel.setSize(100,150);

        JLabel cardLabel2 = new JLabel(new ImageIcon(Plagioclase.GetCardImage()));
        cardLabel2.setSize(100,150);

        contentPane.add(cardLabel);
        contentPane.add(cardLabel2);
        window.add(contentPane);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    } //main() ends here
} //class ends here
