package sentencias_y_bucles;
import java.util.Scanner;

public class laboratorio_1 {

  // Beginning of main method - a program starts from this method and ends here
  public static void main(String []args) {

    /** TODO 2: Create a Scanner variable named "keyboard" **/
    Scanner keyboard = new Scanner(System.in);
    int subChoice;

    /** TODO 3: A variable for getting the day of the week is given below **/
    /**         Initialize the variable to have the value 1 **/
    /** 1- is Monday, 2- is Tuesday and so on **/
    int dayOfTheWeek;
    System.out.println("Enter your choice of the day (1-7): ");
    dayOfTheWeek = keyboard.nextInt();

    // All other TODOs:
    switch (dayOfTheWeek) {
      case 1:
        System.out.println("Monday: It is back to work.....");
        // SUB MENU
        System.out.println("*********** SUB MENU FOR MONDAY ******");
        System.out.println("* 1. Yes, I had my breakfast");
        System.out.println("* 2. No, I would like one");
        System.out.println("**************************************");
        // TODO 10: pedir opción
        System.out.print("Please enter your choice (1 or 2): ");
        subChoice = keyboard.nextInt();
        if (subChoice == 1)
          System.out.print("Good. Now you have a catchup meeting at 9AM Prepare your notes");
        else if (subChoice == 2) {
          System.out.print("Lets us divert on Highway 54 and have a Burger on the drive in");
        } else {
          System.out.print("NO such choice available");
        }
        break;
      case 2:
        System.out.println("Tuesday: Coding day!");

        System.out.print("Which language are you using? (1 = C++, 2 = Java): ");
        int language = keyboard.nextInt();

        switch (language) {
          case 1:
            System.out.println("Great! Time to manage memory carefully in C++.");
            break;
          case 2:
            System.out.println("Awesome! Let's build something powerful with Java.");
            break;
          default:
            System.out.println("Unknown language choice.");
        }
        break;
      case 3:
        System.out.println("Wednesday: Design day!");

        System.out.print("Choose design type (1 = Simple, 2 = Complex): ");
        int design = keyboard.nextInt();

        if (design == 1)
          System.out.println("Simple design keeps things clean and maintainable.");
        else if (design == 2)
          System.out.println("Complex design! Make sure it's scalable.");
        else
          System.out.println("Invalid design choice.");
        break;
      case 4:
        System.out.println("Thursday: Coding in IDE!");

        System.out.print("Choose IDE (1 = IntelliJ, 2 = Eclipse, 3 = VS Code): ");
        int ide = keyboard.nextInt();

        switch (ide) {
          case 1:
            System.out.println("IntelliJ is powerful and smart!");
            break;
          case 2:
            System.out.println("Eclipse is classic and reliable!");
            break;
          case 3:
            System.out.println("VS Code is lightweight and flexible!");
            break;
          default:
            System.out.println("Unknown IDE selected.");
        }
        break;
      case 5:
        System.out.println("Friday: Testing day!");

        System.out.print("Are there errors? (1 = Yes, 2 = No): ");
        int errors = keyboard.nextInt();

        if (errors == 1)
          System.out.println("Fix the bugs before deployment!");
        else if (errors == 2)
          System.out.println("Great! Ready for production!");
        else
          System.out.println("Invalid option.");
        break;
      case 6:
        System.out.println("Saturday: Relax time!");

        System.out.print("Where are you relaxing? (1 = Home, 2 = Bar, 3 = With friends, 4 = Club): ");
        int relax = keyboard.nextInt();

        if (relax == 1)
          System.out.println("Enjoy your peaceful time at home.");
        else if (relax == 2)
          System.out.println("Have a good time at the bar!");
        else if (relax == 3)
          System.out.println("Friends make everything better!");
        else if (relax == 4)
          System.out.println("Dance the night away!");
        else
          System.out.println("Unknown relaxation choice.");
        break;
      case 7:
        System.out.println("Sunday: Planning day!");

        System.out.print("Choose activity (1 = Study, 2 = Gym): ");
        int sundayActivity = keyboard.nextInt();

        switch (sundayActivity) {
          case 1:
            System.out.println("Preparing for a productive week ahead!");
            break;
          case 2:
            System.out.println("Healthy body, healthy mind!");
            break;
          default:
            System.out.println("Invalid Sunday activity.");
        }
        break;
      default:
        System.out.println("Toni entering values less than 1 or more than 7");
    }
  }
}
