
// Nasir Ali
// 31/10/2022
// Final Project Code part

//         ------------------------------------------------------------------------------
//    Java Module Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.SortedMap;
import static java.lang.System.in;

//         ------------------------------------------------------------------------------
//   Global variables declared
public class Main {

    // Global Variables
    public static File fileName; // Read file stored here

    public static Scanner input = new Scanner(in); // taking in user data
    public static Scanner in_File = new Scanner(in); // Reading in File data

    // Declare Global Arrays

    public static String [][] RunnersRecords = new String[16][3];
    public static String [] firstName = new String[16];
    public static String [] secondName = new String[16];
    public static int []  RunTime = new int[16];

    // final sorted run time
    public static String [][]  SortRunTime = new String[16][3];

    // Main Method were we will have password

    //         ------------------------------------------------------------------------------
    //    Start of main program part
    public static void main(String[] args) throws FileNotFoundException{

        String password = "g"; // clyderunners
        int fail = 3;

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

    //         ------------------------------------------------------------------------------
    // Password and main start of program
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
                SortRunners();;
            }
            else if (option == 3) {
                FastPrintOut();
            }
            else if (option == 4) {
                SlowestPrintOut();
            }
            else if (option == 5) {
                UserTimeOfRunner();
            }
            else if (option == 6) {
                UserTimeRunOccurence();
            }
            else if (option == 7) {
                System.out.println("Thank you and Goodbye.");
                System.exit(0);
            }

        } while(option != 7);
    }

    //         ------------------------------------------------------------------------------
    //     Option 1
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

        // this will show the user of app the whole parsed file
        System.out.println("\n\nRunners Records : \n"+Arrays.deepToString(RunnersRecords));

        for(int i=0; i<RunnersRecords.length; i++){  // running list with all the data of the runners
            RunTime[i] = Integer.parseInt(RunnersRecords[i][2]); // running list with all the runners runs record
            secondName[i] = RunnersRecords[i][1]; // runners second name
            firstName[i] = RunnersRecords[i][0];  // runners first name
        }

        System.out.println("First Names are: "+Arrays.toString(firstName));
        System.out.println("Second Names are: "+Arrays.toString(secondName));
        System.out.println("Run Time are: "+Arrays.toString(RunTime));

        in_File.close(); // closing the file

    }

    //         ------------------------------------------------------------------------------
    //     Option 2
    // in this below module the program will sort the runners from slowest to fastest
    public static void SortRunners() throws FileNotFoundException {
        //Arrays.sort(RunTime);
        //System.out.println("First Names are: "+Arrays.toString(RunTime));

        SortRunTime = RunnersRecords;

        String temp;
        for( int out=1 ; out < SortRunTime.length; out++) {
            for (int inner = out; inner >0 ; inner--) {
                 int x = Integer.parseInt(SortRunTime[inner][2]);
                 int y = Integer.parseInt(SortRunTime[inner-1][2]);
                if ( x<y ) {
                    temp = SortRunTime[inner][2];
                    SortRunTime[inner][2] = SortRunTime[inner-1][2];
                    SortRunTime[inner-1][2] = temp;
                }
            }
        }
        outputRecordedTime();
    }

    //  printing it out on a file the final sort out list of runners
    public static void outputRecordedTime() {

        try{
            PrintWriter out = new PrintWriter("src/SlowToFastRunners.txt");
             for(int i=0; i<SortRunTime.length; i++) {
                  out.print("\n\nThe Slowest person is " + SortRunTime[i][0] + " " + " " + SortRunTime[i][1] + " " + SortRunTime[i][2]);
              }
            out.close();
            System.out.println("\n\nSorted Records of Slowest to fastest Runners : \n"+Arrays.deepToString(SortRunTime));

        }catch (Exception e){
            System.out.println("Unexpected error: please run program again.....");
        }
    }



    //         ------------------------------------------------------------------------------
    //     Option 3
    //  In this below module the program will Print out the Fastest runners from the list
    public static void FastPrintOut() {
        int line =0;
        int max= RunTime[0];

        try{
            for( int i=0 ; i < RunTime.length; i++) {
                if (RunTime[i] > max) {
                    max = RunTime[i];
                    line = i;
                }
            }
        System.out.printf("\n\nThe Fastest person is " + firstName[line] + " " + " " + secondName[line] + " " + RunTime[line]);

            PrintWriter out = new PrintWriter("src/FastestRunner.txt");
            out.print("\n\nThe Fastest person is " + firstName[line] + " " + " " + secondName[line] + " " + RunTime[line]);
            out.close();

    }catch (Exception e){
        System.out.println("Unexpected error: please run program again.....");
    }
    }



    //         ------------------------------------------------------------------------------
    //     Option 4
    //  In this below module the program will Print out the Fastest runners from the list
    public static void SlowestPrintOut() {
        int line =0;
        int max= RunTime[0];

        try{
            for( int i=0 ; i < RunTime.length; i++) {
                if (RunTime[i] < max) {
                    max = RunTime[i];
                    line = i;
                }
            }
            System.out.printf("\n\nThe Slowest person is " + firstName[line] + " " + " " + secondName[line] + " " + RunTime[line]);

            PrintWriter out = new PrintWriter("src/SlowestRunner.txt");
            out.print("\n\nThe Slowest person is " + firstName[line] + " " + " " + secondName[line] + " " + RunTime[line]);
            out.close();

        }catch (Exception e){
            System.out.println("Unexpected error: please run program again.....");
        }
    }



    //         ------------------------------------------------------------------------------
    //     Option 5
    //  In this below module the program will Find hte user entered time of runners from the list
    public static void UserTimeOfRunner() {
        System.out.printf("\n\nFinding Runners from the list");
        System.out.printf("\nPlease enter time in seconds : ");
        int RunnerTime = input.nextInt();

        try{
            for( int i=0 ; i < RunTime.length; i++) {
                //int run = RunTime[i] * 60;
                int run = RunTime[i] ;
                if (run == RunnerTime) {
                    System.out.printf("\n\nThe enquire person is " + firstName[i] + " " + " " + secondName[i] + " " + RunTime[i]);
                    PrintWriter out = new PrintWriter("src/EnquiredRunner.txt");
                    out.print("\n\nThe User given Time match runner is " + firstName[i] + " " + " " + secondName[i] + " " + RunTime[i]);
                    out.close();
                    break;
                }
            }

        }catch (Exception e){
            System.out.println("Unexpected error: please run program again.....");
        }
    }


    //         ------------------------------------------------------------------------------
    //     Option 6
    //  In this below module the program will Find hte user entered time of runners and see how many times it's recorded from the list
    public static void UserTimeRunOccurence() {
        System.out.printf("\n\nFinding how many Runners have same run time from the list");
        System.out.printf("\nPlease enter time in seconds : ");
        int RunnerTime = input.nextInt();
        int timeOccurrence = 0;

        try{
            for( int i=0 ; i < RunTime.length; i++) {
                //int run = RunTime[i] * 60;
                int run = RunTime[i];
                if (run == RunnerTime) {
                    timeOccurrence++;
                    System.out.printf("\n\nThe enquire person is " + firstName[i] + " " + " " + secondName[i] + " " + RunTime[i]+"  Time Occurrence "+timeOccurrence);
                    PrintWriter out = new PrintWriter("src/UserGivenTimeRunOccurence.txt");
                    out.print("\n\nThe User Given Run time Match Runner are " + firstName[i] + " " + " " + secondName[i] + " " + RunTime[i]);
                    out.close();
                }
            }
        }catch (Exception e){
            System.out.println("Unexpected error: please run program again.....");
        }
    }

  // End of Program

}
