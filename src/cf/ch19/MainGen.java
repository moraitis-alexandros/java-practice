package cf.ch19;

import java.util.List;

public class MainGen {

    public static void main(String[] args) {
            NodeGen<String> stringNodeGen = new NodeGen<>();
            NodeGen<Integer> intNode = new NodeGen<>();
            var doubleNode = new NodeGen<Double>();

            intNode.setItem(1);
//            String s = (String)intNode.getItem();// Error at compile time

        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        String[] cities = {"Athens", "Paris", "London"};

        print(cities);
        print(intArr);


    }

    public static <T> void print(T[] a) {
        for (T item : a) {
            System.out.println(item);
        }
    }

    public static <T> void printList(List<T> a) {
        for (T t : a) {
            System.out.println(t);
        }
    }

    public static void printGenericList(List<?> list, Object element) {
        //list.add(element)
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


    public static void printNode(NodeGen<? extends Number> nodeGen) {
        System.out.println(nodeGen.getItem());
    }

    public static <T extends Number> void printBounded(List<T> list) {
        double sum = 0.0;

        for (T number : list) {
            sum += number.doubleValue();
        }
    }

    public static <T> void consumerProducer(List<? super T> consumer, List<? extends T> producer) {
        for (T t : producer) {
            consumer.add(t);
        }
    }


}
