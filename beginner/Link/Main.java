package beginner.Link;
import java.util.*;

import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        try(Scanner input = new Scanner(System.in)){
            int third = input.nextInt();
            int first = third*4;
            System.out.println(first);
            
        } catch(Exception e){
            System.out.println(e);
        }
 
    }
 
}
