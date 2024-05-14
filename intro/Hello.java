package beginner;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Hello world!");
            String nome = teclado.nextLine();
            float nota = teclado.nextFloat();
            System.out.printf("%s tirou %.2f", nome, nota);
        } catch(Exception e){
            System.out.println("Deu erro otário");
        }
    }
}
