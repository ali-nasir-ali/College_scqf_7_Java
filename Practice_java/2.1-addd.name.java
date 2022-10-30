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

    
    System.out.println("\n\n please enter the length of Height in meters = ");
    
    int HeightNum = input.nextInt();  // Read user input
    
    System.out.println("please enter the length of width in meters = ");
    int widthNum = input.nextInt();  // Read user input

    System.out.println("please enter your the length of depth in meters ");
    int depthNum = input.nextInt();  // Read user input

    getArea ( HeightNum ,widthNum);
    getVolume (HeightNum ,widthNum, depthNum);
 }
  
  public static String multiplyNames (String name1,String name2) {
    String result = name1 + ' ' + name2;
    return result;
  }


  
  public static void getArea (int Height ,int width) {
    int result = Height * width;
    System.out.println("The AREA in meters = "+result);
  }


  
  public static void getVolume (int Height ,int width,int depth) {
    int result = Height * width * depth;
    System.out.println("The VOLUME in meters = "+result);
  }
  
  
}
