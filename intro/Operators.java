package beginner;
import java.lang.Math;

public class Operators {
    public static void main(String[] args) {
        int a = (int) 10;
        int a2 = (int)Math.pow(a, 2);
        int an = (int)Math.sqrt(a2);

        short absolute = (short)Math.abs(-11);
        short floored = (short)Math.floor(3.7);
        short ceiled = (short)Math.ceil(3.2);
        short rounded = (short)Math.round(7.5);

        short rand = (short)Math.round(Math.random()*100);
        short randScoped = (short)( 3 + Math.random() * (7 - 3)); //[3;7]



        System.out.println("\n" + Math.PI);
        System.out.println(a2);
        System.out.println(an);
        System.out.println(absolute);
        System.out.println(floored);
        System.out.println(ceiled);
        System.out.println(rounded);
        System.out.println(rand);
        System.out.println(randScoped);

    }
}
