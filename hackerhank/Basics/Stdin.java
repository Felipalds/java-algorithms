import java.util.Scanner;
import java.util.InputMismatchException;

public class Stdin {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int intData = scanner.nextInt();
      double doubleData = scanner.nextDouble();
      scanner.nextLine();
      String stringData = scanner.nextLine();

      System.out.println("String: " + stringData);
      System.out.println("Double: " + doubleData);
      System.out.println("Int: " + intData);

    } catch (InputMismatchException ioe) {
      System.out.println(ioe);
    } finally {
      scanner.close();
    }
  }  
}
