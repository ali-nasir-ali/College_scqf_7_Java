
// nasir ali
// 14-09-2022

import java.util.Scanner; // Import the Scanner class
public class Main {
    public static void main(String[] args) {

        //CalculateTip();

        //BankLogin();   // Module for user password checking

        Bank_Transaction();
    }

    /*
    Task 1:
     When you use an automated teller machine (ATM) with your bank card, you
     need to use a personal identification number (PIN) to access your account. If a
     user fails more than three times when entering the PIN, the machine will block
     the card. Assume that the user’s PIN is “1234” and write a program that asks the
     user for the PIN no more than three times, and does the following:
          • If the user enters the right number, print a message saying, “Your PIN is
            correct”, and end the program.
          • If the user enters a wrong number, print a message saying, “Your PIN is
            incorrect” and, if you have asked for the PIN less than three times, ask for
            it again.
          • If the user enters a wrong number three times, print a message saying
            “Your bank card is blocked” and end the program
     */

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

                CalculateTip(); // Once the login pass is correct then the user can access this

                break;          // after the user access the module the program flow breaks out of the loop
            }
            count++;
        }
        if (count > 1)
            System.out.println("Your bank card is blocked”");

        System.exit(0);   // At the end of module the program flow breaks out of the program
    }

    /*

    Task 2:
    Calculating the tip when you go to a restaurant is not difficult, but your
    restaurant wants to suggest a tip according to the service diners receive. Write a
    program that calculates a tip according to the diner’s satisfaction as follows:
            • Ask for the diners’ satisfaction level using these ratings: 1 = Totally
              satisfied, 2 = Satisfied, 3 = Dissatisfied.
            • If the diner is totally satisfied, calculate a 20 percent tip.
            • If the diner is satisfied, calculate a 15 percent tip.
            • If the diner is dissatisfied, calculate a 10 percent tip.
            • Report the satisfaction level and tip in dollars and cents.
     */


    public static void CalculateTip() {

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("\n Please choose the level of satisfaction from today's meal: ");
        System.out.println(" 1: Totally satisfied. \n 2: satisfied \n 3: Dissatisfied \n");
        int Satisfection_level = input.nextInt();

            if (Satisfection_level == 1 ) {

                System.out.println("Thank you for coming to our restaurant.\n Your bill of £45 at %20 Tip is: £51 " );

            } else if ( Satisfection_level == 2) {

                System.out.println("\n Thank you for coming to our restaurant.\n Your billof £45 at %15 Tip is: £50");
            } else if (Satisfection_level == 3) {

                System.out.println("\n Thank you for coming to our restaurant.\n Your bill of £45 at %10 Tip is: £49");
            }else {
                System.out.println("Please select the correct option");
            }

    }

    /*
    Task 3:
     Write a program to simulate a bank transaction. There are two bank accounts:
     checking and savings. First, ask for the initial balances of the bank accounts;
     reject negative balances. Then ask for the transactions; options are deposit,
     withdrawal, and transfer. Then ask for the account; options are checking and
     savings. Then ask for the amount; reject transactions that overdraw an account.
     At the end, print the balances of both accounts.


     ask for the initial balances of the bank accounts > reject negative balance
     ask for the transactions; options are deposit, withdrawal, and transfer
     ask for the account; options are checking and savings
     ask for the amount > reject transactions that overdraw an account
     At the end, print the balances of both accounts

     */


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
            } else if (option == 2) {
                Account_Type_Withdrawal(Checking_Account , Savings_Account);
            } else if (option == 3) {
                Account_Type_Transfer(Checking_Account , Savings_Account);
            } else {
                System.out.println("Please select the correct option");
            }
        }

    }


    // Validating whether the Entered amount is not negative
    static double readValidPrice(Scanner sc) {
        double price = sc.nextDouble();
        sc.nextLine(); // skip line break

        if (price < 0) {
            System.out.print("Price cannot be a negative value, please enter price again: ");
            return readValidPrice(sc); // recursive call
        }
        return price;
    }


    // Validating amount in the account is not in negative
    static double CheckValidAmount(Scanner sc,double account) {
        double amount = sc.nextDouble();
        double cal_account = account;
        sc.nextLine(); // skip line break
        cal_account -= amount;
        if (cal_account < 0) {
            System.out.print("Account cannot be a negative value, please enter amount again: ");
            return CheckValidAmount(sc,account); // recursive call
        }
        return cal_account;
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
                Continue();
            } else if (option_acc == 2) {
                System.out.print("\n How much would you like to Deposit in Savings Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount += Checking_Account;
                System.out.print("The new balance in your Savings Account is: " + amount);
                Continue();
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
                double balance = CheckValidAmount(input,Checking_Account);
                System.out.print("The new balance in your Checking account is: " + balance);
                Continue();
                break;
            } else if (option_acc == 2) {
                System.out.print("\n How much would you like to Withdrawal from Savings Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount -= Checking_Account;
                System.out.print("The new balance in your Savings Account is: " + amount);
                Continue();
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
                Continue();
            } else if (option_acc == 2) {
                System.out.print("\n How much would you like to Transfer from Savings Account: ");
                double amount = readValidPrice(input); // valid value is guaranteed to be read;
                amount -= Checking_Account;
                System.out.print("The new balance in your Savings Account is: " + amount);
                Continue();
            } else {
                System.out.println("Please select the correct option");
            }
        }
    }

    public static void Continue() {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        while(true){
        System.out.print("\n\n Would you like to see the options again? Y/N : ");
        char choice = input.next().charAt(0);

        // use switch statement to check condition
        switch (choice) {
            case 'Y': // these cases will be compared against the condition
            case 'y': // if any return true then execute associated statement
                System.out.println("\n Menu Again ");
                Bank_Transaction();
                //break; // if above returns true break from switch statement (code block)
            case 'N':
            case 'n':
                System.out.print("Thank you for being with New Mars Bank");
                break;
            default:// default statement if all above cases do not compare
                System.out.println("Please choose Y/N available");
        }
        System.exit(0);   // At the end of module the program flow breaks out of the program
    }
}
}
