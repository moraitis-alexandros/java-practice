package cf.ch14.chapterExercises.logger;

import java.sql.Timestamp;

/**
 * Singleton class that prints error messages with a timestamp
 */
public class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {

    }//default constructor

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void logMessage(String message) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(message + " " + timestamp);
    }







}//class
