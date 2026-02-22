package sentencias_y_bucles;
import java.util.Scanner;

public class uso_del_switch {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    // TODO EXERCISE CALCULATOR
    System.out.println("enter the 1st number: ");
    int number1 = keyboard.nextInt();

    System.out.println("enter the 2nd number: ");
    int number2 = keyboard.nextInt();

    System.out.println("enter the operation: ");
    if (keyboard.hasNextLine())
      keyboard.nextLine();
    String operator = keyboard.nextLine();

    int result = 0;

    switch (operator) {
      case "+":
        result = number1 + number2;
        break;
      case "-":
        result = number1 - number2;
        break;
      case "*":
        result = number1 * number2;
        break;
      case "/":
        result = number1 / number2;
        break;
      default:
        System.out.println("the operator is invalid");
    }
    System.out.println("the result is: " + result);
  }
}
