package cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class maps {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("GR", "Greece");
        countries.put("EN", "England");
        countries.put("US", "United States");

        //Get
        String value = countries.get("GR");
        System.out.println(value);

        //Iterate
        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + "value: " + entry.getValue());
        }
            for (Map.Entry<String, String> e : countries.entrySet()) {
                System.out.println("Key: " + e.getKey() + "value: " + e.getValue());
            }

            countries.forEach((k,v) -> System.out.println("Key: " + v + "value: " + v));

            //Remove
            countries.remove("GR");


            //Update
            countries.put("GR", "Hellas");

    }

}
