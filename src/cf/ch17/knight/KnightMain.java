package cf.ch17.knight;

public class KnightMain {

    private final static Runnable joa = new Knight("joa");
    private final static Runnable whiteKnight = new Knight("white");
    private final static Runnable ulo = new Knight("ulo");

    public static void main(String[] args) {
        new Thread(joa).start();
        new Thread(whiteKnight).start();
        new Thread(ulo).start();
    }


}
