package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by heyuehuang on 2017-02-01.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    /**
     * A default constructor mood, set the date
     *
     */
    public Mood(){
        this.date = new Date();
    }

    /**
     * A constructor when user input date
     *
     * @param date       user specify date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * A constructor when user input date
     *
     * @param date       user specify date
     * @param mood       user specify mood
     */
    public Mood(String mood, Date date){
        this.mood = mood;
        this.date = date;
    }

    /**
     * Setter and Getter for date and mood
     */
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
