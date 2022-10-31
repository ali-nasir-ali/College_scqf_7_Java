
// Nasir Ali
// 30/10/2022

import java.util.Scanner;
import java.util.ArrayList; // have to import for arraylist

public class Main {
    public static void main(String[] args) {

        //here we make java scanner object for this method
        Scanner input = new Scanner(System.in);

        int []arrNumber;
        // Making the list from taking value from user
        System.out.printf("\n\nPlease enter How long you want the list:  ");
        int ListLenght = input.nextInt();
        arrNumber = new int[ListLenght];

        System.out.printf("\n\nPlease enter Item for the list");
        for(int i=0; i < ListLenght; i++) {
            System.out.printf(" for "+(i+1)+" : ");
            arrNumber[i] = input.nextInt();
        }

        int maximum = maxNumber(arrNumber);
        System.out.println("Maximum value is: "+maximum);

        int minimum = minNumber(arrNumber);
        System.out.println("Minimum value is: "+minimum);

    }

    public static int maxNumber(int[] arr) {
        int maximum_value = arr[0];
        for(int a=1; a < arr.length; a++) {

            if(arr[a]> maximum_value){
                maximum_value = arr[a];
            }
        }
        return maximum_value;
    }
    public static int minNumber(int[] arr) {
        int minimum_value = arr[0];
        for(int a=1; a < arr.length; a++) {

            if(arr[a] < minimum_value){
                minimum_value = arr[a];
            }
        }
        return minimum_value;
    }
}
