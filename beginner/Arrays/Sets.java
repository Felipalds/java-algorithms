import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sets {
    public static void main(String[] args) {
        

        Set<String> cars;
        cars = new HashSet<String>(); // The difference between sets and lists is that sets items are uniques
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Fusca");
        cars.add("Volvo");

        System.out.println(cars);
        System.out.println(cars.contains("Fusca"));
        System.out.println(cars.remove("Volvo"));
        System.out.println(cars.remove("Volvo"));


        for( String i : cars) {
            System.out.println(i);
        }
    }
}
