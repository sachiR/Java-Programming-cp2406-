import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number..");
        num1 = input.nextInt();
        if (num1%2 == 0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is Odd");
    }
}
