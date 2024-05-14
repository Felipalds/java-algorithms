package beginner.Tea;
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
 
       try(Scanner input = new Scanner(System.in)){
            int tea = input.nextInt();
            int counter = 0;

            for(int c = 0; c < 5; c++){
                int answer = input.nextInt();
                if(answer == tea) counter++;
            }

            System.out.println(counter);

        } catch(Exception e){
            System.out.println(e);
        }

 
    }
 
}