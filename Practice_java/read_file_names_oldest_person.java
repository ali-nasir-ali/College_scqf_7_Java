

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static PrintWriter out;
    public static File filename; // gloable object which can be accessed by the entire class
    public static Scanner in;

    public static void main(String[] args)  throws FileNotFoundException{

        readFile();

    }
    public static void readFile() throws FileNotFoundException {
        String NameofFile = "src/names.csv";
        filename = new File(NameofFile);
        in = new Scanner(filename);
        int max= 0;
        String title = null;
        String foreName = null;
        String sirName =null ;

        System.out.println("\n\n While loop printing the whole of CSV file ");
        while (in.hasNext()){
            String allWords = in.next();
            System.out.println(allWords);

            String [] Words = allWords.split(",");
            System.out.println("\n FOR loop printing out individual line element");
            for(String word:Words){
                System.out.println(word);
            }

            System.out.println("\n inside while after for loops printing out Array");
            System.out.println(Arrays.toString(Words));

            int [] age = new int[Words.length];
            age[3] = Integer.parseInt(Words[3]);

            if(age[3] > max){
                max = age[3];

                title = Words[0];
                foreName = Words[1];
                sirName = Words[2];
            }
        }
        output(max,title,foreName,sirName);
    }

    public static void output(int max, String title, String foreName, String sirName) {

        try{
            out = new PrintWriter("src/OldestPerson.txt");

            out.print("\n\nThe oldest person is "+title+" "+foreName+" "+" "+sirName+" "+max);

            System.out.println("The oldest person is "+title+" "+foreName+" "+" "+sirName+" "+max);
            out.close();
            in.close();

        }catch (Exception e){
            System.out.println("Unexpected error: please run program again.....");
        }

    }
}
