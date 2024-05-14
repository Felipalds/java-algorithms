package beginner;
/**
 * 
 * @author Luiz Felipe
 * @version 1.0
 */
public class Types {
    public static void main(String[] args) {

        /**
         * Integers
         * Byte: 1 byte (-126;127)
         * Short: 2 bytes (-32766;32767)
         * Integer: 4 bytes (-2147482;2147483);
         * Long: 8 bytes (-2^63;2^63);
         */
        int integer = 3;
        int secondInteger = (int)4; //typecast
        Integer thirdInteger = Integer.valueOf(5); // not deprecated wrapper

        /**
         * Floats
         * Float: 4 bytes (3.4*10^38);
         * Double: 8 bytes (1.8*10^308);
         */
        float flo = 15.2f; // it needs the f
        float flo2 = (float) 15.2; // typecast does not need the f
        Float flo3 = Float.valueOf(15.2f); // the new class is deprecated and this way needs the f

        /**
         * Literals
         * 1 byte (for each letter)
         * char and string
         * Char, String
         */
        char letter = 'L';
        char letter2 = (char) 'L';
        Character letter3 = Character.valueOf('L');
        String name = String.valueOf("Luiz");

        /**
         * Logical type
         * 1 bit (0 or 1)
         * true or false
         */
        boolean tf = true;
        boolean tf2 = (boolean) false;
        Boolean tf3 = Boolean.FALSE;
        Boolean tf4 = Boolean.valueOf(true);

        System.out.printf("\nVariables: %s \n", name);
        System.out.printf("%d\n%d\n%d\n", integer, secondInteger, thirdInteger);
        System.out.printf("%.2f\n%.2f\n%.2f\n", flo, flo2, flo3); //number of decimals
        System.out.printf("%c %c %c", letter, letter2, letter3); //number of decimals
        System.out.printf("\n%b %b %b %b", tf, tf2, tf3, tf4); //number of decimals
        
    }
}
