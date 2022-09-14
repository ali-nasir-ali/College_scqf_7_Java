
// methods goes here

class Main {
  public static void main(String[] args) {
     
    int num1 = 10;
    int num2 = 10;

    multipluNumbers(num1,num2); // no return

    int result = returnMultiplyNumber(num1,num2);  // return value
    System.out.println("\n The multiply of num = " + result);

    emptyParamMethos();
    
  }
  
  public static void multipluNumbers (int number1,int number2) {
    System.out.println("\n This Method have no retunrn type");
    int result = number1 * number2;
    System.out.println("\n The multiply of num = " + result);
  }
  
  public static int returnMultiplyNumber (int number1,int number2) {
    System.out.println("\n This Method have a return type with value");
    int result = number1 * number2;
    return result;
  }


  public static void emptyParamMethos () {
    System.out.println("\n This Method have no return and passing parameters type");
    int number1 = 10;
    int number2 = 10;
    int result = number1 * number2;
    System.out.println("\n The multiply of num = " + result);
  }
  
}
