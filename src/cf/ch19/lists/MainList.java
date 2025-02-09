package cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("London");
        cities.add("NY");

        String city = cities.getFirst();

        int nyPosition = cities.indexOf("NY");
        if (nyPosition != -1) {
            cities.set(nyPosition, "New York");
        } else {
            System.out.println("New York not exists");
        }

        if (cities.contains("Athens")) {
            cities.remove("Athens");
        } else {
            System.out.println("Athens not exists");
        }

        cities.removeIf(c -> c.startsWith("A"));

        //Iterate 3 ways
        for (String c : cities) {
            System.out.println(c);
        }

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        cities.forEach(System.out::println);

        Iterator<String> it2 = cities.iterator();

        while (it2.hasNext()) {
            String city2 = it2.next();
            if (city2.equals("NY")) {
                it.remove();
//                cities.remove(city2); // Exception
            }
        }



    }
}
