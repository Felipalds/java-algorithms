import java.util.*;
import java.util.stream.*;

public class Main {
    static class Item {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public Item(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Item item1 = new Item(1, "asdfasdf");
        Item item2 = new Item(2, "asdfasdf");
        Item item3 = new Item(3, "asdfasdf");
        Item item4 = new Item(4, "asdfasdf");
        Item item5 = new Item(5, "asdfasdf");

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        items.forEach(item -> System.out.println(item.name));
        items.stream().filter(i -> i.getId() >= 5).forEach(i -> System.out.println(i.getId()));

        IntStream ids = items.stream().mapToInt(i -> i.getId());
        ids.forEach(System.out::println);

        System.out.println(items);
    }
}