
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class
public class Main {
    public static void main(String[] args) {
        /*
    Exercise 1:
Create a program that asks the user to input 5 numbers. Store each of these numbers inside
an array and then calculate the sum total. Print the sum total to the user.
         */
        System.out.println(" User Input and Sum of them ");
        Exercise_1();

        /*
Exercise2:
Create a 2D array with 3 rows and 3 columns of type String. Populate the 2D Array with the
following values.
Example table:  Miss Anne-Marie Docherty  ,  Mr James McLoughlin  ,  Mrs Jane Doe
Using a nested for loop print out each row / column of the Array.
         */
        System.out.println(" Array and its elements ");
        Exercise_2();

 /*
Exercise 3:
Create a program which asks the user to enter the title, firstname and lastname
and place the values into an ArrayList. Use for each loop to print the values
contained in the ArrayList back to the user with suitable message.
     */
        System.out.println(" ArrayList and its elements ");
        Exercise_3();

    }


    public static void Exercise_1() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int sum=0;
        //creates an array in the memory of length 5
        int[] User_number = new int[5];
        System.out.println("\n\n Adding Five Numbers in an Array: ");
        for(int i=0; i<5; i++)
        {
            System.out.print("please enter a "+i+" number: ");  //reading array elements from the user
            User_number[i]=input.nextInt();
            sum+=User_number[i];
        }
        System.out.println("\n sum of all the User Entered Numbers : "+sum);

    }

    public static void Exercise_2() {
        String[][] User_Table = { {"Miss","Anne-Marie","Docherty"},{"Mr","James","McLoughlin"},{"Mrs","Jane","Doe"} };
        System.out.println("\n\n Printing out Array Elements: ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(User_Table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Exercise_3() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        //creates an arraylist in the memory
        ArrayList<String> User_Message = new ArrayList<String>(); // Create an ArrayList object
        String[] Question = {"title", "firstname", "lastname"};

        for(String Questio: Question)
        {
            System.out.print("please enter a "+Questio+" : ");  //reading array elements from the user
            String element=input.nextLine();
            User_Message.add(element);
        }
        System.out.println("\n All the User Entered Elements in an ArrayList : " + User_Message);

    }
}
