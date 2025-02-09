package cf.ch19.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {

        List<String> cities = List.of("Athens", "Toronto","Tunis","Athens");

        var tCities = cities.stream().filter(city -> city
                .startsWith("T")).collect(Collectors.toList()); //Java 8+, mutable list

        var tCities2 = cities.stream().filter(city -> city
                .startsWith("T")).toList(); //Java 16+, immutable list

        var tCities3 = cities.stream().filter(city -> city.length() >= 6).toList(); //Java 16+, immutable list

        tCities3.forEach(System.out::println);

        System.out.println();
        Set<String> uniqueCityNames = new HashSet<>(cities);
        Set<String> uniqueCityNames2 = cities.stream().collect(Collectors.toSet());

     uniqueCityNames2.forEach(System.out::println);

     var strCities = cities.stream().collect(Collectors.joining(", "));
//        var strCities2= String.join(", ", cities);


    }

}
