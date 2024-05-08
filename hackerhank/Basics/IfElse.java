import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        String text = "";

        if (N % 2 != 0) {
           text = "Weird";
        } else {
            if (N >= 2 && N <= 5) {
                text = "Not Weird";
            } else if (N >= 6 && N <= 20) {
                text = "Weird";
            } else if (N > 20) {
                text = "Not Weird";
            }
        }

        System.out.println(text);

        bufferedReader.close();

    }
}
