
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number;

        do{
            System.out.print("\nPlease enter a number bet 1 and 50: ");
            number = in.nextInt();

            if(number <0 || number > 50){
                System.out.print("\nThat number is out of bounds. Please try again: ");
            }

        }while(number< 0 || number > 50);

        System.out.println("You eneterd number "+number+" correctly.");

    }
}
