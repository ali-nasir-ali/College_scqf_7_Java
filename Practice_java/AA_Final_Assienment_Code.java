
// Nasir Ali
// 31/10/2022
// Final Project Code part

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    // Global Variables
    public static File fileName; // Read file stored here

    public static Scanner input = new Scanner(System.in); // taking in user data
    public static Scanner in_File = new Scanner(System.in); // Reading in File data

    // Declare Global Arrays

    public static String [][] RunnersRecords = new String[16][3];
    public static String [] firstName = new String[16];
    public static String [] secondName = new String[16];
    public static int [] listOfRun = new int[16];

    // Main Method were we will have password

    public static void main(String[] args) throws FileNotFoundException{

        String password = "g"; // clyderunners
        int fail = 3;

        // countOccurrence();
        // findHighest();

        do{
            System.out.println("Welcome to Glasgow Clyde Runners Club.");
            System.out.println("Please enter your password to continue: ");
            String login = input.nextLine();
            if( login.equals(password)){
                System.out.println("Password Validated.");

                Menu();

            }
            else{
                fail--;
                System.out.println("Your Password is Incorrect");//print message to user
                System.out.println("You have "+fail+" attempts left.");
            }
        } while(fail != 0);
        System.out.println("Number of attempt exceeded. You are now locked out.");
        System.exit(0);
    }

    // If the user enters a right password they will then be given a menu
    public static void Menu() throws FileNotFoundException{

        int option = 0;

        do{
            System.out.println("\n\n\nPlease choose from the following options:");
            System.out.println("1. Read and Display File");
            System.out.println("2. Sort and Print Recorded Times");
            System.out.println("3. Find and Print Fastest Time");
            System.out.println("4. Find and Print Slowest Time");
            System.out.println("5. Search");
            System.out.println("6. Time Occurrence");
            System.out.println("7. Exit Program");
            option = input.nextInt();

            if(option == 1){

                readFile();

            }
            else if (option == 2) {
                //calculateGrade();
            }
            else if (option == 3) {
                //countOccurrence();
            }
            else if (option == 4) {
                //findHighest();
            }
            else if (option == 5) {
                //findLowest();
            }
            else if (option == 6) {
                //findLowest();
            }
            else if (option == 7) {
                in_File.close();
                System.out.println("Thank you for using the Cardonald Colleg Grade App. Goodbye...");
                System.exit(0);
            }

        } while(option != 7);
    }

    // In here we will read the file of raw data and parse it in to an array so it easier to read and manipulate
    public static void readFile() throws FileNotFoundException{

        String nameOfFile = "src/race results-1.txt"; // reading file from local storage
        fileName = new File(nameOfFile);
        in_File = new Scanner(fileName);

        String oneline = null;
        int a=0;
        // while lop so to read through the while file
        while(in_File.hasNextLine()){
            //process each line
            oneline = in_File.nextLine(); // first read the file into a java local variable
            String [] colume = new String[0];
            colume = oneline.split(" "); // regex to parse it with spaces in between words Z
            System.out.println(Arrays.deepToString(colume));
            for (int j=0; j < 3 ; j++){
                    RunnersRecords[a][j] = colume[j];
                }
            a++;
            // here going through the variable which contain the whole file and parsing it into a smaller local variables
            // so to populate runners names and unnerving times
        }

        /*
        String [] colume = new String[0];
        System.out.printf("\n\n ::  ");
        for(int i=0; i < RunnersRecords.length; i++){
            //Line = oneline.split(" "); // regex to parse it with spaces in between words Z
            colume = oneline.split(" "); // regex to parse it with spaces in between words Z

            System.out.println(Arrays.deepToString(colume));
            for (int j=0; j < 3 ; j++){
                RunnersRecords[i][j] = colume[j];

                System.out.println(" ====  "+colume[j]);
                //System.out.println(RunnersRecords[i][j]);
            }
        }

         */


        // this will show the user of app the whole parsed file
        System.out.println("Runners Records : \n\n"+Arrays.deepToString(RunnersRecords));

        for(int i=0; i<RunnersRecords.length; i++){  // running list with all the data of the runners
            listOfRun[i] = Integer.parseInt(RunnersRecords[i][2]); // running list with all the runners runs record
            System.out.println("First Names are: "+Arrays.toString(firstName));
            secondName[i] = RunnersRecords[i][1]; // runners second name
            firstName[i] = RunnersRecords[i][0];  // runners first name
        }

        System.out.println("First Names are: "+Arrays.toString(firstName));
        System.out.println("Second Names are: "+Arrays.toString(secondName));
        System.out.println("Course Grades are: "+Arrays.toString(listOfRun));

    }


/*

    public static void calculateGrade() {

        for(int i=0; i< totalGrades.length; i++){
            totalGrades[i] = halfTermMarks[i] + fullTermMarks[i];

            if(totalGrades[i] >= 80 && totalGrades[i] <= 100){
                award[i] = "A";
                System.out.println("Well Done "+firstName[i] +" you got an A");
            } else if (totalGrades[i] >= 70 && totalGrades[i] <80) {
                award[i] = "B";
                System.out.println("Well Done "+firstName[i] +" you got a B");
            }else if (totalGrades[i] >= 60 && totalGrades[i] <70) {
                award[i] = "C";
                System.out.println("Well Done "+firstName[i] +" you got a C");
            }else if (totalGrades[i] >= 50 && totalGrades[i] <60) {
                award[i] = "D";
                System.out.println("Well Done "+firstName[i] +" you got a D");
            }
            else  {
                award[i] = "No Award";
                System.out.println("Unfortunately "+firstName[i] +" you failed to achieve a grade. Better luck next time.");
            }
        }
        System.out.println("\n\n Full Grades"+Arrays.toString(totalGrades));
        System.out.println(" Full Awards"+Arrays.toString(award));
    }

    public static void countOccurrence() {

        int count = 0;

        for(int i=0; i< award.length; i++){
            if(award[i].equals("A")){
                count++;
            }
        }
        System.out.println("There are: "+ count+" 'A' passes in the class.");
    }
    public static void findHighest() {

        int highestMark = totalGrades[0];
        String student = " ";

        for(int i=1; i< totalGrades.length; i++){
            if( totalGrades[i] > highestMark ){
                highestMark = totalGrades[i];
                student = firstName[i];
            }
        }
        System.out.println("Highest Mark of "+ highestMark+" was achived by "+student+" in the class.");
    }
    public static void findLowest() {

        int lowestMark = totalGrades[0];
        String student = " ";

        for(int i=1; i< totalGrades.length; i++){
            if( totalGrades[i] < lowestMark ){
                lowestMark = totalGrades[i];
                student = firstName[i];
            }
        }
        System.out.println("Lowest Mark of "+ lowestMark+" was achived by "+student+" in the class.");
    }

 */
}
