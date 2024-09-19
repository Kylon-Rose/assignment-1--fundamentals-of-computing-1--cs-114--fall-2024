import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("KK      KK    RRRRRRRRRR"); 
    System.out.println("KK    KK      RR        RR");
    System.out.println("KK  KK        RR          RR");
    System.out.println("KK KK         RR        RR");
    System.out.println("KK  KK        RR    RR");
    System.out.println("KK    KK      RR      RR");
    System.out.println("KK      KK    RR        RR");

   Scanner scanner = new Scanner(System.in);
   
    System.out.println("Please enter a number in Fahrenheit");
    double fahrenheit = scanner.nextDouble();

    double celsius = (fahrenheit - 32) * 5 / 9;

    System.out.println("The temp is: " + celsius);

    System.out.println("Please enter a 5-character string");

    String original = "Kylon";
    String reversed = new StringBuilder(original).reverse(). toString();
    String trimmed = reversed.substring (1, reversed.length() - 1);
    System.out.println(trimmed);

  scanner.close(); 
  }
}
