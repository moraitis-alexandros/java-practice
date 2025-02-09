package cf.ch19.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Apples", 10.5, 45),
                new Product("Oranges", 8.5, 20),
                new Product("Mango", 8.5, 20),
                new Product("Strawberries", 12.4, 30)
        );

        ArrayList<String> listOfNames = products.stream()
                .map(Product::getName).collect(Collectors.toCollection(ArrayList::new));

        int totalQuantities = products.stream().mapToInt(Product::getQuantity).sum();

    }

}
