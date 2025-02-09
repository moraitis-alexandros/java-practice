package cf.ch19.deq_queue;

import cf.ch19.deq_stack.MyStack;

public class DeqMain {
    /**
     * LIFO Impl with Deque.
     * @param args
     */
    public static void main(String[] args) {
        MyQueue<String> strQueue = new MyQueue<>();

        strQueue.enQueue("AVX");
        strQueue.enQueue("AVX33");
        strQueue.enQueue("2SDFVX");

        String firstOut = strQueue.deQueue();
        System.out.println(firstOut);
        System.out.println();

        strQueue.forEach(System.out::println);
    }
}
