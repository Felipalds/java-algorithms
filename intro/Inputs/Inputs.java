import java.util.*;

public class Inputs {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("================================"); 
        while(scanner.hasNextLine()) {
            
            String inputLine = scanner.nextLine();
            
            if(inputLine.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = inputLine.split(" ");

            String inputString = parts[0];
            int inputInt = Integer.parseInt(parts[1]);

            System.out.printf("%-15s%03d\n", inputString, inputInt);
        }
        System.out.println("================================"); 
        scanner.close();
    }
}
