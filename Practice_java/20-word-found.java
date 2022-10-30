
// Nasir Ali
// 30/10/2022

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final List<String> cars = Arrays.asList("Volvo", "BMW", "Ford", "Mazda");

    public static void main(String args[]) {

        //here we make java scanner object for this method
        Scanner input = new Scanner(System.in);

        String serchword = "";
        System.out.printf("\n\nPlease enter car brand to be search to see if its in list:  ");
        serchword = input.nextLine();

        if (cars.contains(serchword)) {
            System.out.println("The word Found");
        } else {
            System.out.println("The word not found ");
        }
    }
}
