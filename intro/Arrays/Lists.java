import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    

    /**
     *  @param args
     */
    public static void main(String[] args) {

        class Car {
            String name;
        }

        List<String> cars1; // It is an interface!
        List<String> cars2; // It makes it more generic!

        cars1 = new ArrayList<String>(); // Here we are implementing the interface List
        cars2 = new LinkedList<String>();


        List<Car> cars_list; // Here we are using a generics;
        cars_list = new ArrayList<Car>();

        Car car1 = new Car();
        car1.name = "Volkswagen";

        Car car2 = new Car();
        car2.name = "Volvo";


        cars_list.add(car1);
        cars_list.add(1, car2);
        System.out.println(cars_list.get(0).name);

        System.out.println(cars_list.get(1).name);
        System.out.println(cars_list.size());
    }
}
