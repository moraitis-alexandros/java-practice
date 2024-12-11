package cf.ch10;

public class StackApp {
    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {

        int num;

        try {
//            push(1);
//            push(2);
//            push(3);
            num = pop();
            System.out.println("Popped num " + num);
            printStack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//main

    public static void push(int num) throws Exception {
        try {
            if (isFull()) throw new Exception("Error! Stack is Full");
            myStack[++top] = num;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }//push

    public static int pop() throws Exception {
        try {
            if (isEmpty()) throw new Exception("Error! Stack is Empty");
            return myStack[top--];
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }//pop

    public static boolean isEmpty() {
        return top == -1;
    }//isEmpty

    public static boolean isFull() {
        return top == myStack.length - 1;
    }//isFull

    public static void printStack() throws Exception {
        try {
            if (isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            //Προσοχή θέλω iteration έως το top!!! όχι όλο τον πίνακα.
            for (int i = 0; i <=top; i++) {
                System.out.println(myStack[i]+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}//class
