// https://www.kaggle.com/
import java.util.Scanner; // Import the Scanner class
// methods goes here

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner object
    
    //   getNames();
    
    // variable declaration
    char colour;
    // series of print outs to ask user to choose option
    // user option is assigned to variable colour
    System.out.println("Please choose from the following colours:");
    System.out.println("A. Add Name");
    System.out.println("B. Calculate Area");
    System.out.println("C. Calculate Volume");
    colour = input.next().charAt(0);
    

    // use switch statement to check condition
    switch (colour) {
      case 'A': // these cases will be compared against the condition
      case 'a': // if any return true then execute associated statement
input.next();
        System.out.print("please enter your First Name = ");
        String fName = input.nextLine(); // Read user input

        System.out.print("\n please enter your Sir Name = ");
        String sName = input.nextLine(); // Read user input

        String FullName = multiplyNames(fName, sName); // returns Full name

        System.out.println("\n Your Full Name is = " + FullName);

        break; // if above returns true break from switch statement (code block)
      case 'B':
      case 'b':

        System.out.println("\n\n please enter the length of Height in meters = ");

        int heightNum = input.nextInt(); // Read user input

        System.out.println("please enter the length of width in meters = ");
        int widthNum = input.nextInt(); // Read user input

        getArea(heightNum, widthNum);
        break;
      case 'C':
      case 'c':

        System.out.println("\n\n please enter the length of Height in meters = ");

        int HeightNu = input.nextInt(); // Read user input

        System.out.println("please enter the length of width in meters = ");
        int widthNu = input.nextInt(); // Read user input

        System.out.println("please enter your the length of depth in meters ");
        int depthNu = input.nextInt(); // Read user input
        getVolume(HeightNu, widthNu, depthNu);
        break;
      default:// default statement if all above cases do not compare
        System.out.println("Please choose colours available");
    }

  }

  
  public static String multiplyNames(String name1, String name2) {
    String result = name1 + ' ' + name2;
    return result;
  }

  public static void getArea(int Height, int width) {
    int result = Height * width;
    System.out.println("The AREA in meters = " + result);
  }

  public static void getVolume(int Height, int width, int depth) {
    int result = Height * width * depth;
    System.out.println("The VOLUME in meters = " + result);
  }

}
