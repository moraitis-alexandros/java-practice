package cf.ch14.services;

public class CodingFactoryLazy {

    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy() {

    }

    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

}//class
