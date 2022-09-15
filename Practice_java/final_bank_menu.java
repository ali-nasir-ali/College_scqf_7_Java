
// nasir ali
// 14-09-2022

import java.util.Scanner; // Import the Scanner class
public class Main {
    public static void main(String[] args) {

        //BankLogin();   // Module for user password checking
        Bank_Transaction();
    }



    public static void BankLogin() {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        String password = "1234";

        System.out.println("Enter password");
        String inputPassword = input.next();

        int count = 0;

        //create while loop, set loop continuation condition to count < 3
        while (count <= 1) {

            if ( (!inputPassword.equals(password))) {

                System.out.println("Your PIN is incorrect. Enter password");
                inputPassword = input.next();
            } else {
                System.out.println("Your PIN is correct");

                break;          // after the user access the module the program flow breaks out of the loop
            }
            count++;
        }
        if (count > 1)
            System.out.println("Your bank card is blocked”");

        System.exit(0);   // At the end of module the program flow breaks out of the program
    }





    public static void Bank_Transaction() {

        double Checking_Account = 0;
        double Savings_Account  = 0;

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("\n Wellcome To Your New Mars Bank Account ");
        System.out.print("\n can you please enter your Checking Account Value: ");
        Checking_Account = readValidPrice(input); // valid value is guaranteed to be read

        System.out.print("\n can you please enter your Savings Account Value: ");
        Savings_Account = readValidPrice(input); // valid value is guaranteed to be read

        while(true) {
            System.out.println("Transactions Options");
            System.out.print(" 1: Deposit. \n 2: Withdrawal. \n 3: Transfer. ");
            int option = input.nextInt();
            if (option == 1) {
                Account_Type_Deposit(Checking_Account , Savings_Account);
                break;
            } else if (option == 2) {
                Account_Type_Withdrawal(Checking_Account , Savings_Account);
                break;
            } else if (option == 3) {
                Account_Type_Transfer(Checking_Account , Savings_Account);
                break;
            } else {
                System.out.println("Please select the correct option");
            }
        }

    }

    // Validating weather the Entered amount is not negative
    static double readValidPrice(Scanner sc) {
        double price = sc.nextDouble();
        sc.nextLine(); // skip line break

        if (price < 0) {
            System.out.print("Price cannot be a negative value, please enter price again: ");
            return readValidPrice(sc); // recursive call
        }
        return price;
    }

    //      1: Deposit.
    public static void Account_Type_Deposit(double Checking_Account ,double Savings_Account ) {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        while(true) {
            System.out.println("Please Select Account:\n 1:Checking Account. \n 2:Savings Account." );
            int option_acc = input.nextInt();
            if (option_acc == 1) {
                System.out.print("\n How much would you like to Deposit in Checking Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount += Checking_Account;
                System.out.print("The new balance in your Checking account is: " + amount);
                break;
            } else if (option_acc == 2) {
                System.out.print("\n How much would you like to Deposit in Savings Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount += Checking_Account;
                System.out.print("The new balance in your Savings Account is: " + amount);
                break;
            } else {
                System.out.println("Please select the correct option");
            }
        }
    }


    //    2: Withdrawal.

    public static void Account_Type_Withdrawal(double Checking_Account ,double Savings_Account ) {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        while(true) {
            System.out.println("Please Select Account:\n 1:Checking Account. \n 2:Savings Account." );
            int option_acc = input.nextInt();
            if (option_acc == 1) {
                System.out.print("\n How much would you like to Withdrawal from Checking Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount -= Checking_Account;
                System.out.print("The new balance in your Checking account is: " + amount);
                break;
            } else if (option_acc == 2) {
                System.out.print("\n How much would you like to Withdrawal from Savings Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount -= Checking_Account;
                System.out.print("The new balance in your Savings Account is: " + amount);
                break;
            } else {
                System.out.println("Please select the correct option");
            }
        }
    }

    // 3: Transfer.

    public static void Account_Type_Transfer(double Checking_Account ,double Savings_Account ) {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        while(true) {
            System.out.println("Please Select Account:\n 1:Checking Account. \n 2:Savings Account." );
            int option_acc = input.nextInt();
            if (option_acc == 1) {
                System.out.print("\n How much would you like to Transfer from Checking Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount -= Checking_Account;
                System.out.print("The new balance in your Checking account is: " + amount);
                break;
            } else if (option_acc == 2) {
                System.out.print("\n How much would you like to Transfer from Savings Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount -= Checking_Account;
                System.out.print("The new balance in your Savings Account is: " + amount);
                break;
            } else {
                System.out.println("Please select the correct option");
            }
        }
    }

    public static void Continue() {

        System.out.print("Would you like to see the obtions again? Y/N");
        colour = input.next().charAt(0);

        // use switch statement to check condition
        switch (colour) {
            case 'Y': // these cases will be compared against the condition
            case 'y': // if any return true then execute associated statement
                input.next();
                BankLogin();
                //break; // if above returns true break from switch statement (code block)
            case 'N':
            case 'n':
                System.out.print("Thank you for being with New Mars Bank");
                break;
            default:// default statement if all above cases do not compare
                System.out.println("Please choose colours available");
        }
    }
}
