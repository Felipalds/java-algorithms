import java.util.*;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 10; i++) {
            System.out.printf("N[%d] = %d\n", i, n);
            n *= 2;
        }
    }
}
