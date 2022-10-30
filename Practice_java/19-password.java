
// Nasir Ali
// 30/10/2022

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //here we make java scanner object for this method
        Scanner in = new Scanner(System.in);
        // we will setup a password for the user to input
        String pass = "ClydeGlasgow"; 
        // user input will be stored here
        String enterCode; 
        // we will use do while loop to run it couple of times and it will run first time without checking
        do {
            System.out.println("Can yo enter in your pass code: ");
            // using scanner to get user input
            enterCode = in.nextLine(); 
            // checking if the pass is incorrect 
            if (!pass.equals(enterCode)) { 
                System.out.println("Entered password is wrong."); 
                System.out.println("Please enter again: "); 
            }
          // the loop will only end when the pass is correct  
        } while (!pass.equals(enterCode)); 
        System.out.println("Password is right welcome in.");
    }
}
