public class Main {
    public static void main(String[] args) {

        System.out.println("\n While , do while , for loop printing 1 to 10 \n");
        Exercise_1();

        System.out.println("\n\n While , do while , for loop printing 10 to 1 \n");
        Exercise_2();

        System.out.println("\n\n for loop taking sum of the numbers 10 to 1 \n");
        Exercise_3();

    }
    /*           Loop Exercises
Exercise 1:
Write a program using a while loop that prints out the numbers from 1 to 10
Write a program using a Do While loop that prints out the numbers from 1 to 10
Write a program using a For loop that prints out the numbers from 1 to 10

Exercise 2:
Write a program using a while loop that prints out the numbers from 10 to 1
Write a program using a Do While loop that prints out the numbers from 10 to 1
Write a program using a For loop that prints out the numbers from 10 to 1

Exercise 3: More advanced
Write a program that uses a For loop that calculates and prints the sum of the numbers from 1
to 10.

     */
    public static void Exercise_1() {
        System.out.print(" while loop : ");
        int i=1; //loop counter initialisation
        while(i<=10)
        {   System.out.print(i);System.out.print(',');
            i++;
        }

        System.out.print("\n do while loop : ");
        int j=1; //loop counter initialisation
        do  {   System.out.print(j);System.out.print(',');
            j++;
        }while(j<=10);

        System.out.print("\n for loop : ");
        for(int k=1; k<=10; k++){
            System.out.print(k);System.out.print(',');
        }
    }

    public static void Exercise_2() {
        System.out.print(" while loop : ");
        int i=10; //loop counter initialisation
        while(i>=1)
        {   System.out.print(i);System.out.print(',');
            i--;
        }

        System.out.print("\n do while loop : ");
        int j=10; //loop counter initialisation
        do  {   System.out.print(j);System.out.print(',');
            j--;
        }while(j>=1);

        System.out.print("\n for loop : ");
        for(int k=10; k>=1; k--){
            System.out.print(k);System.out.print(',');
        }

    }

    public static void Exercise_3() {
        int sum =0;
        System.out.print("\n for loop taking sum of number from 1 till 10: ");
        for(int k=10; k>=1; k--){
            sum+=k;
        }
        System.out.print(sum);
    }

}
