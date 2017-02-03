package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class is mood type class of the project. <br> In this class,
 * A mood type is defined.Two getters and setters for date and mood.
 *
 * @author Heyue Huang
 * @version 1.4.2
 * @since 1.0
 */
public abstract class Mood {
    private Date date;
    private String mood;

    /**
     * A default constructor mood, set the date
     */
    public Mood(){
        this.date = new Date();
    }

    /**
     * A constructor when user input date
     *
     * @param date user specify date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * A constructor when user input date
     *
     * @param mood user specify mood
     * @param date user specify date
     */
    public Mood(String mood, Date date){
        this.mood = mood;
        this.date = date;
    }

    /**
     * Setter and Getter for date and mood
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

    /**
     * Gets mood.
     *
     * @return the mood
     */
    public String getMood() {
        return mood;
    }

    /**
     * Sets mood.
     *
     * @param mood the mood
     */
    public void setMood(String mood) {
        this.mood = mood;
    }
}
