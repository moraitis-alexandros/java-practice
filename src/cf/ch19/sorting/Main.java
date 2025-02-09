package cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("kkk1", 12.5, 10),
                            new Product(" aaa1", 12.6, 55)); //Immutable list


        List<Product> products2 = Arrays.asList(new Product("aaa2", 12.5, 10),
                new Product("kkk2 ", 12.6, 55)); //partially immutable list


        List<Product> products3 = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 10),
                new Product("Oranges", 30.0, 200),
                new Product("Apples", 12.6, 55)
                )); //Mutable

//        products3.sort(Comparator.naturalOrder()); //Sort based on comparable
//        products3.sort(Comparator.reverseOrder()); // based on Comparable

//        products3.sort(Comparator.comparing(Product::getName));

        products3.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity));

        products3.forEach(System.out::println);

    }
}
