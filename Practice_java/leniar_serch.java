
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int value;
        int numOfElements;
        int search;
        int array[];

        Scanner in = new Scanner(System.in);

        System.out.print("How many number you want to store in the array: ");
        numOfElements = in.nextInt();
        array = new int[numOfElements];

        System.out.println("Enter "+ numOfElements+" numbers");

        for(value =0;value<numOfElements;value++){
            array[value] = in.nextInt();
        }

        System.out.print("Enter number to find: ");
        search = in.nextInt();

        for(value=0;value<numOfElements;value++){
            if(array[value] ==search){
                System.out.println(search+" is present at location "+ (value+1));
                System.out.println(Arrays.toString(array));
                break;
            }
        }
        if(value == numOfElements){
            System.out.println(search+" isn't present at the array.");
            System.out.println(Arrays.toString(array));
        }
    }
}
