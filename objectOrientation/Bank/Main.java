package objectOrientation.Bank;

public class Main {
    public static void main(String[] args) {
        Bank c1 = new Bank();

        c1.open("Luiz Felipe", "S", 10.0f);
        System.out.println(c1.getBalance());
    }
}
