//package advanced.task.solution;
/*
 @author Anne Marie Docherty
 */
//imports for ArrayLists, Collections, Scanner (create new objects or use methods
//associated with java class)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        mainMenu(); //method called from main (entry into program)
    }
    public static void mainMenu(){

        //Create new ArrayList objects - one list to hold game titles (string) and      one list to hold game prices(double)
        ArrayList <String> title = new ArrayList<>();
        ArrayList <Double> price = new ArrayList<>();
        int choice = 0;
        String again =""; // declare and intialise variables to hold value for   users choices
        Scanner input = new Scanner(System.in); // create new scanner object

        do{//use do loop i.e. first part of code will always run. Condition at end  of loop will be checked to see if the loop is to be repeated

            System.out.println("Main Menu");
            // display menu to console for user
            System.out.println("1. Enter game Details");
            System.out.println("2. Display Titles in Order");
            System.out.println("3. Display Total Price");
            System.out.print("Choice: ");
            choice = input.nextInt();//read in user's choice and assign value to  variable choice


            //use condition statement to call methods depending upon the user's    choice i.e. 1,2 or 3
            if(choice == 1){
                gameDetails(title, price);//if user chooses option 1 call method  gamedetails (ArrayList title and ArrayList price will be passed to method)
            }
            if(choice == 2){
                displayTitles(title);//if user chooses option 2 call method displayTitles(ArrayList title will be passed to this method)
            }
            if (choice ==3){ //if usr chooses option 3 call method  displayTotal(ArralyList price will be passed to this method)
                displayTotal(price);
            }
            System.out.print("Display menu again (y/n)?:");
            again = input.next();//ask the user if they wish to go back to main    menu and assign value "y" or "n" to variable again
        }
        while ("y".equals(again));//use Java equals method to compare value held      in variable again against the value "y" if condition met repeat loop

    }
    //declare and create method that will get the details of their game from user (ArrayList title and ArrayList price will be passed to this method)
    public static void gameDetails(ArrayList<String>title, ArrayList<Double>price)
    {

        //Create new scanner object for this method
        Scanner input = new Scanner(System.in);
        System.out.println("Input Game Details");
        System.out.println("Game Title:");
        String gameTitle = input.nextLine();
        //ask the user to input the title for their game. Read in the user input   and assign the value to local variable gameTitle

        System.out.println("Game Price:");
        double gamePrice = input.nextDouble();
        //ask the user to input the price for their game. Read in the user input     and assign the value to local variable gamePrice

        title.add(gameTitle); // add value contained in local variable gameTitle to  ArrayList title (new item will be added to ArrayList title)
        price.add(gamePrice); // add value contained in local variable gamePrice to       ArrayList price (new item will be added to ArrayList price)

        System.out.println(title);
        System.out.println(price);//print out items contained in ArrayList title     and ArrayList price to console
    }
    //delcare and create method that will sort the game titles into alphabetical     order (ArrayList title will be passed to this method)
    public static void displayTitles(ArrayList<String> title)
    {
        Collections.sort(title);//use Java Collection class and sort method on    items contained in ArrayList title
        System.out.println(title);//display sorted list to console

    }
    //declare and create method that will total all of the price items contained in   ArrayList price (ArrayList price passed to this method)
    public static void displayTotal(ArrayList<Double>price)
    {
        double total = 0;//declare and initalise local variable to hold value of    all game prices

        for(double i: price){//use for each loop i.e. for each item in ArrayList   price......

            total = total + i;//....calulate the total price of all items     contained in the ArrayList price and assign value to variable total


        }
        System.out.println("The total cost of all games is " + total);//print out        the value held in variable total to console

    }
}
