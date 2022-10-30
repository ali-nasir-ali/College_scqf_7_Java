
// Nasir Ali
// 30/10/2022

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //  Manu start and all the menu options
        mainstart();
    }
    public static void displayItemName(ArrayList<String> ItemName)
    {   //  by using java collection class, we sort the ItemName elements
        Collections.sort(ItemName);
        //  print out the items to screen for UX
        System.out.println(ItemName);
    }

    //  Making the sum of all the items in the array
    public static void displayFinalSum(ArrayList<Double>SalePrice)
    {   // We make and declare a variable to store Final Sum of all the items prices
        double FinalSum = 0;

        for(double i: SalePrice){
            // let's sum up the prices
            FinalSum = FinalSum + i;


        }        //  print out the items to screen for UX
        System.out.println("The total cost of all games is " + FinalSum);

    }

    //  Getting user data as shown in the UX and calling other methods for simplyfing the process
    public static void gameDetails(ArrayList<String>ItemName, ArrayList<Double>ItemPrice)
    {

        //here we make java scanner object for this method
        Scanner in = new Scanner(System.in);
        System.out.println("Input Game Details "
                         + "\nGame Title:");
        String gameItemName = in.nextLine();

        // Getting user Input for Item and their game Price
        System.out.println("Game Price:");
        double gamePrice = in.nextDouble();

        // Getting user Input for Item and their game Price
        //
        // Adding the game price nad name at the end of the array by using java class
        ItemPrice.add(gamePrice);
        ItemName.add(gameItemName);
        System.out.println(ItemName + "\n" + ItemPrice);
    }

   //   Introduction
   //  Your task is to create a simple stock keeping system for a computer
   //  game store. The system will allow the user to input the titles and
   //  prices of various games, which can then be displayed back to the user
   //  in alphabetical order and as a grand total respectively.
   //         Requirements
  //  The system will have a menu-driven command-line interface
  //  The system will be written in the Java programming language
  //  The user can input the titles of multiple games
  //  The user can input the price of each game
  //  The system can display the game titles in alphabetical order
  //  The system can display the total price of all the games


    //delcare and create method that will sort the game titles into alphabetical     order (ArrayList title will be passed to this method)

    public static void mainstart(){
         // Making new arrays for holding the game shop items
        ArrayList <Double> ItemPrice = new ArrayList<>();
        ArrayList <String> ItemName = new ArrayList<>();

        // Holding the user Menu Choice
        int choice = 0;
        String again ="";
        //here we make java scanner object for this method
        Scanner in = new Scanner(System.in);
         
        // by using a do while loop it will run until a user have chosen to end it
        do{

             // Printing out the Menu For user
            System.out.println("Main Menu");
            System.out.println("1. Enter game Details");
            System.out.println("2. Display Item Name in Order");
            System.out.println("3. Display Total Price");
            System.out.print("Choice: ");
            // Taking in User choice from menu
            choice  = in.nextInt();


            // From given choice the user can selection then it will call the given method
            if(choice  == 1){
                gameDetails(ItemName, ItemPrice);
            }
            if(choice  == 2){
                displayItemName(ItemName);
            }
            if (choice  ==3){ 
                displayFinalSum(ItemPrice);
            }
            // If the user selects Y it will run again
            System.out.print("Display menu again (y/n)?:");
            again = in.next();
        }
        // if the user selct y then in the while loop will run again
        while ("y".equals(again));

    }
}
