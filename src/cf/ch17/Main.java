package cf.ch17;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book.Builder(1, "1234").build();
        Book book2 = new Book.Builder(2, "123134").author("SS").title("ASDASD").build();

    }//main


}
