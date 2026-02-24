package bucle_for;

public class inversion_de_cadena {
  public static void main(String[] args) {
    // The string given
    String stringToReverse = "TONI says ice cream PER scoop";
    // The string to contain the reversed string
    String reversed = "";
    for(int indexPosition = stringToReverse.length() - 1; indexPosition >= 0; indexPosition--) {
      char ch = stringToReverse.charAt(indexPosition);
      reversed = reversed + ch;
    }
    System.out.println("The reverse of " + stringToReverse + " is: " + reversed);
  }
}
