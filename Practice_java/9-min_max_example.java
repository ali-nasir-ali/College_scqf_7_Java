

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int[] arrNumber = new int[] {50, 100, 34, 78, 4, 160, 500};

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
