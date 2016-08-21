public class FormLetterWriter {

    public static void main(String[] args){
        displaySalutation ("Kim");
        displaySalutation ("V", "Kim");
    }
    public static void displaySalutation(String LastName){
        System.out.println("Dear Mr. or Ms. " + LastName);
        System.out.println("Thank you for your recent order \n");
    }
    public static void displaySalutation( String FirstName,String LastName){
        System.out.println("Dear " +FirstName+ " " + LastName);
        System.out.println("Thank you for your recent order \n");
    }
}
