package cf.ch19.deq_stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class MyStack<T> {

    private final Deque<T> mystack = new LinkedList<>();

    public MyStack() {

    }

    public Deque<T> getMystack() {
        return mystack;
    }

    public void push(T t) {
        mystack.push(t);
    }

    public T pop() {
        return mystack.pop();
    }

    public void forEach(Consumer<T> action) {
        mystack.forEach(action);
    }
}
