import java.util.*;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = Float.parseFloat(scanner.nextLine());
        }

        for (int i = 0; i < 100; i++) {
            if(numbers[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, numbers[i]); 
            }
        }
    }
}
