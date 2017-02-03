package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * This class is tweet type class of the project. <br> In this class,
 * A tweet type is defined.Mood can be added as a list in each tweet.
 * Tweet type:
 * <pre>
 *     pre-formatted text: <br>
 *         File Explorer -> data -> data -> ca.ualberta.cs.lonelytwitter -> files -> file.sav.
 * </pre>
 * <code> begin <br>
 *     some pseduo code here <br>
 * end.</code>
 * The file name is indicated in the &nbsp &nbsp &nbsp FILENAME constant.
 * <ul>
 *     <li>item 1</li>
 *     <li>item 2</li>
 *     <li>item 3</li>
 * </ul>
 * <ol>
 *     <li>item 1</li>
 *     <li>item 2</li>
 *     <li>item 3</li>
 * </ol>
 *
 * @author Heyue Huang
 * @version 1.4.2
 * @since 1.0
 */
public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * Add the happy mood
     *
     * @param message : new message
     * @param date    : the date
     */
    public void addHappyMood(String message, Date date){
        Mood mood = new Happy(message, date);
        moodList.add(mood);
    }

    /**
     * Add the mad mood
     *
     * @param message : new message
     * @param date    : the date
     */
    public void addMadMood(String message, Date date){
        Mood mood = new Mad(message, date);
        moodList.add(mood);
    }

    /**
     * Add the happy mood
     *
     * @param date : the date
     */
    public void addHappyMood(Date date){
        Mood mood = new Happy(date);
        moodList.add(mood);
    }

    /**
     * Add the mad mood
     *
     * @param date : the date
     */
    public void addMadMood(Date date){
        Mood mood = new Mad(date);
        moodList.add(mood);
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
