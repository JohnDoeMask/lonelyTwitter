package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class is an important tweet which inherits from Tweet class of the project. <br> In this class,
 * There are two instantiates, and a boolean method will return true, if the class is called.
 *
 * @see Tweet
 * @author Heyue Huang
 * @version 1.4.2
 * @since 1.0
 */
public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
