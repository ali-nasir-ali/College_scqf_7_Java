
import java.util.Scanner;  // Import the Scanner class
// methods goes here
public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);  // Create a Scanner object


        /*
        Exercise 1:
         Create a program that passes two variables (firstName, lastName) to a method. This method
         will then concantenate the two names and return the fullName. Print out the fullname to
         console.
         */
        System.out.println("\n\n Adding Two Names togather");
                        System.out.print("please enter your First Name: ");
                        String fName = input.nextLine();  // Read user input

                        System.out.print("please enter your Sir Name: ");
                        String sName = input.nextLine();  // Read user input

                        String FullName = multiplyNames(fName,sName); //  returns Full name

                        System.out.print("\n Your Full Name is = " + FullName);

         /*
         Exercise 2:
          Create a program that asks the user to input two numbers. Create a method which adds the
          two numbers together and returns the result. Print the result to the user with suitable sentence
          i.e. "The total of your numbers is ......."
         */
        System.out.println("\n\n Calculating the sum of Two Numbers");
                        System.out.print(" Please enter the length of Height in meters = ");

                        int one_num = input.nextInt();  // Read user input

                        System.out.print("please enter the length of width in meters = ");
                        int two_num = input.nextInt();  // Read user input

                        getSum( one_num ,two_num);

         /*
           Exercise 3:
            Create a program with two methods. One method will be responsible for calculating the area
            of a square and the other method will be responsible for calculating the volume of a square.
            Either initialise the values needed or ask user to input values needed. Call the two methods
            and print out both results.
          */
        System.out.println("\n\n Calculating the Area and Volume of square ");
                        System.out.print("\n\n please enter the length of one side in meters = ");

                        int LengthNum = input.nextInt();  // Read user input
                        Calculate_Square(LengthNum);
                }




            public static String getNames(String name1, String name2) {
                String result = name1 + ' ' + name2;
                return result;
            }
            public static String multiplyNames(String name1, String name2) {
                String result = name1 + ' ' + name2;
                return result;
            }

            public static void getSum(int one_num, int two_num) {
                int result = one_num + two_num;
                System.out.print("The total of your numbers is ....... " + result);
            }

            public static void Calculate_Square(int length) {
                int area = length * length ;
                int volume = length * length * length;
                System.out.print("The AREA in meters: " + area +" and VOLUME in meters: "+volume);
            }

        }
