import java.util.Scanner;  // Import the Scanner class
// methods goes here

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    
    System.out.println("please enter your First Name");
    String fName = input.nextLine();  // Read user input
    
    System.out.println("please enter your Sir Name");
    String sName = input.nextLine();  // Read user input
     
    String FullName = multiplyNames(fName,sName); //  returns Full name

    System.out.println("\n Your Full Name is = " + FullName);
 }
  
  public static String multiplyNames (String name1,String name2) {
    String result = name1 + ' ' + name2;
    return result;
  }
  
  
}
