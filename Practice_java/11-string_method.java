

import java.util.Scanner; // Import the Scanner class
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        // Exercise 1:
        // Create a program which asks the user to enter their first name and last name and assign to
        // separate string variables. Using concatenation output a suitable message to console along
        // with their full name.

        Scanner input = new Scanner(System.in); // Create a Scanner object

        String fName;
        String sName;

        System.out.println("Pleas enter first name: ");
         fName = input.next();

        System.out.println("Pleas enter first name: ");
         sName = input.next();

        System.out.println("Your fulll name is :"+ fName + " " +sName);

        // Exercise 2:
        // Create a program and assign the following value to a String variable‘Glasgow Clyde Collge’.
        // Using the String length() method output the number of characters (length) of the string to
        // console.

        String College = "Glasgow Clyde College";

        int strLenght = College.length() ;

        System.out.println("\n\n Length of the char: " + strLenght);

        System.out.println("\n\n Length of the String with out white space : " + College.replace(" ","").length());

        // Exercise 3:
        // Create a program and assign the following value to a String variable ‘Glasgow Clyde
        // College’. Using the string substring() method separate the 3 substrings i.e. ‘Glasgow’,
        // ‘Clyde’, ‘College’ and assign those to their own variable. Print the original string and
        // substrings to console

        System.out.println("\n\n Full sentense of college : "+College);
        System.out.println("\n Now the seperate parts : ");

        String parts[] = College.split(" ");
        for(String part: parts) {
            System.out.println("Parts are : " + part);
        }

        // Exercise 4:
        // Create a program which asks the user to input two separate words to console and assign them
        // to 2 string variables. Using the equals() method compare the two values to see if they are the
        // same.
        //         Hint: You will also need to include an if else statement....if statement will check for
        // comparison and else will be needed if the if statement returns false.

        System.out.println("\n\n Now we will Compare Two separte inputes from user and see if they are same \n");

        System.out.println("Pleas enter First word : ");
        String fWord = input.next();

        System.out.println("Pleas enter Second Word : ");
        String sWord = input.next();

        boolean retval = fWord.equals(sWord);
        if (retval == true) {
            System.out.println("The two words are SAME ");
        }
        else {
            System.out.println("The two words are NOT SAME");
        }

        // Exercise 5:
        // Ask the user to enter their first name and then their last name. Give them a new user ID
        // which include their first initial and surname. Output a suitable message to the user to include
        // their new user ID.
        //         Hint: You will have to use substring() and concatenation to output the correct result

        System.out.println("\n\n Now we will make an ID from combination of your first name initial and sir name \n");
        System.out.println("Pleas enter First name: ");
        String First_Name = input.next();

        System.out.println("Pleas enter Second name: ");
        String Second_Name = input.next();

        System.out.println("Your ID is : "+ First_Name.substring(0,1) + Second_Name );

    }

}
