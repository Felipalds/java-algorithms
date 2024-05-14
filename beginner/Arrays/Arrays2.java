import java.util.*;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            int currentN = Integer.parseInt(scanner.nextLine());
            numbers[i] = currentN > 0 ? currentN : 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("X[%d] = %d\n", i, numbers[i]);
        }
    }
}
