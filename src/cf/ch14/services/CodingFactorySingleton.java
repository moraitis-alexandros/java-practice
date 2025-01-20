package cf.ch14.services;

public class CodingFactorySingleton {

    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    private CodingFactorySingleton() {

    }//constructor

    public static CodingFactorySingleton getInstance() {
        return INSTANCE;
    }//static factory


}//class
