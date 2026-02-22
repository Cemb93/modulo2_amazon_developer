package sentencias_y_bucles;

public class condicionales {
  public static void main(String[] args) {
    String testString1 = "This is java";
    String upperCaseTestString1 = testString1.toUpperCase();

    //this will not execute
    if( testString1.equals(upperCaseTestString1) ) {
      System.out.println("Value of testString1 is equal to is uppercase version");
    }

    String testString2 = "THIS IS JAVA";
    String upperCaseTestString2 = testString2.toUpperCase();

    //this will execute
    if( testString2.equals(upperCaseTestString2) ) {
      System.out.println("Value of testString2 is equal to is uppercase version\n");
    }

    //TODO EXERCISE-1 set the default string value
    String stringToBeDisplayed = "Next year, please";

    //set string that is set by you
    String howWasLastYear = "he was good in his activities";

    //check if the string "howWasLastYear" has the word "good" in it (it is case sensitive)
    if(howWasLastYear.contains("good")) {

      //if the word "good" is found change the value to be displayed
      stringToBeDisplayed = "You get a gift from Santa";
    }

    // this area is the common area after the "if" condition
    // which is always executed
    System.out.println("Santa's Result: " + stringToBeDisplayed);

    //TODO EXERCISE-2
    String name1= "santa";
    String name2 ="Santa";

    if(name1.equalsIgnoreCase(name2)) {
      System.out.println("The names are the same.");
    }
  }
}
