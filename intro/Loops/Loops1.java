package beginner.Loops;

import java.util.Scanner;

public class Loops1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int c = 1; c <= 10; c++) {
                System.out.printf("%d x %d = %d\n", n, c, n*c);
            }
        }
    }
}
