package sentencias_y_bucles;
import java.util.Scanner;

public class ejercicio_condicionales {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("enter the age: ");
    int age = keyboard.nextInt();

    System.out.println("enter the money: ");
    float money = keyboard.nextInt();

    keyboard.nextLine();
    System.out.println("enter the name: ");
    String name = keyboard.nextLine();

    System.out.println(name +
            " having age = " + age +
            " has " + money + " dollars in pocket."
    );
  }
}
