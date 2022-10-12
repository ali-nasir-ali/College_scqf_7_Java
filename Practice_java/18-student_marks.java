

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    // Global Variables

    public static File fileName;
    public static Scanner in_File = new Scanner(System.in);
    public static Scanner in_Variable =  new Scanner(System.in);

    // Declare Global Arrays

    public static String [][] StudentRecords = new String[10][4];

    public static String [] firstName = new String[10];
    public static String [] secondName = new String[10];
    public static int [] halfTermMarks = new int[10];
    public static int [] fullTermMarks = new int[10];

    public static int [] totalGrades = new int [10];
    public static String [] award = new String[10];


    // Main Method

    public static void main(String[] args) throws FileNotFoundException{

        String password = "GC";
        int fail = 3;

        do{
            System.out.println("Welcome to the Glasgow Student Grade App.");
            System.out.println("Please enter your Password to continue :");
            String login = in_Variable.nextLine();
            if( login.equals(password)){
                System.out.println("Password Validated.");

                Menu();

            }
            else{
                fail--;
                System.out.println("Your Password is Incorrect");
                System.out.println("You have "+fail+" attempts left.");
            }

        } while(fail != 0);
        System.out.println("Number of attempt exceeded. You are now locked out.");
        System.exit(0);
    }

    public static void Menu() throws FileNotFoundException{

        int option = 0;

        do{
            System.out.println("\n\n\nPlease choose from the following options:");
            System.out.println("1. Read in File");
            System.out.println("2. Calculate Grade");
            System.out.println("3. Count Occurence");
            System.out.println("4. Find Highest Grade");
            System.out.println("5. Find Lowest Grade");
            System.out.println("6. Exit");
            option = in_Variable.nextInt();

            if(option == 1){

                readFile();

            }
            else if (option == 2) {
              calculateGrade();
            }
            else if (option == 3) {
                countOccurrence();
            }
            else if (option == 4) {
                findHighest();
            }
            else if (option == 5) {
                findLowest();
            }
            else if (option == 6) {
                in_Variable.close();
                System.out.println("Thank you for using the Cardonald Colleg Grade App. Goodbye...");
                System.exit(0);
            }

        } while(option != 6);
    }

    public static void readFile() throws FileNotFoundException{

        String nameOfFile = "src/Student Marks.csv";
        fileName = new File(nameOfFile);
        in_File = new Scanner(fileName);

        while (in_File.hasNextLine()){
            for(int i=0; i < StudentRecords.length; i++){
                String [] line = in_File.nextLine().split(",");
                for (int j=0; j < line.length ; j++){
                    StudentRecords[i][j] = line[j];
                }
            }
        }

        System.out.println("Student Records \n"+Arrays.deepToString(StudentRecords));

        for(int i=0; i<fullTermMarks.length; i++){
            fullTermMarks[i] = Integer.parseInt(StudentRecords[i][3]);
            halfTermMarks[i] = Integer.parseInt(StudentRecords[i][2]);
            secondName[i] = StudentRecords[i][1];
            firstName[i] = StudentRecords[i][0];
        }

        System.out.println("First Names are: "+Arrays.toString(firstName));
        System.out.println("Second Names are: "+Arrays.toString(secondName));
        System.out.println("Course Grades are: "+Arrays.toString(halfTermMarks));
        System.out.println("Prelim Grades are: "+Arrays.toString(fullTermMarks));
    }

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

    }
    public static void findHighest() {

    }
    public static void findLowest() {

    }
}
