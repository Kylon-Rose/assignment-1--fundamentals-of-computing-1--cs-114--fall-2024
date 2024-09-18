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
  }
}
