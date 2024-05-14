package beginner.Intro;

import java.util.Scanner;

public class Intro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int z = scanner.nextInt();
        int l = scanner.nextInt();

        if((h > z && h < l) || (h < z && h > l)){
            System.out.println("huguinho");
        }

        if((z > h && z < l) || (z < h && z > l)){
            System.out.println("zezinho");
        }

        if((l > z && l < h) || (l < z && l > h)){
            System.out.println("luisinho");
        }
    }
}
