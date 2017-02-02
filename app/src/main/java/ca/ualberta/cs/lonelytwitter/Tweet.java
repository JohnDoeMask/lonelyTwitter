package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by heyuehuang on 2017-01-19.
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * Add the happy mood
     *
     * @param message: new message
     * @param date: the date
     */
    public void addHappyMood(String message, Date date){
        Mood mood = new Happy(message, date);
        moodList.add(mood);
    }

    /**
     * Add the mad mood
     *
     * @param message: new message
     * @param date: the date
     */
    public void addMadMood(String message, Date date){
        Mood mood = new Mad(message, date);
        moodList.add(mood);
    }

    /**
     * Add the happy mood
     *
     * @param date: the date
     */
    public void addHappyMood(Date date){
        Mood mood = new Happy(date);
        moodList.add(mood);
    }

    /**
     * Add the mad mood
     *
     * @param date: the date
     */
    public void addMadMood(Date date){
        Mood mood = new Mad(date);
        moodList.add(mood);
    }

    public Date getDate() {
        return date;
    }

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

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
