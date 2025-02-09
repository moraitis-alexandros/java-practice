package cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {

    public static void main(String[] args) throws Exception {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David");



        //Optional is a class for wrapping null. Avoid NPE
        Optional<String> query = names.stream().filter(name -> name.equals("Alice")).findFirst();

        query.ifPresent(System.out::println);
        //same as below
        if(query.isPresent()) {
            System.out.println(query.get());
        }

        String strFirst = names.stream().filter(name -> name.equals("Bob")).findFirst().orElse("Not found");
        String strFirst2 = names.stream().filter(name -> name.equals("Bob")).findFirst().orElseThrow(() -> new Exception("Bob not found"));



        //Match
        boolean isBobExists = names.stream().anyMatch(name -> name.equals("Bob"));

        boolean allAreBob =  names.stream().allMatch(name -> name.equals("Bob"));

        boolean noneIsBob =  names.stream().noneMatch(name -> name.equals("Bob"));

    }


}
