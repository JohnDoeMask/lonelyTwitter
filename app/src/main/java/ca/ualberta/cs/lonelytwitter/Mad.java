package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class is mad mood which inherits Mood class of the project. <br> In this class,
 * A special message method will be used to return a identified string.
 *
 * @see Mood
 * @author Heyue Huang
 * @version 1.4.2
 * @since 1.0
 */

public class Mad extends Mood {
    /**
     * A mad mood
     *
     * @param date     the inputted
     */
    public Mad(Date date) {
        super(date);
    }

    /**
     * A mad mood
     *
     * @param date
     * @param mood       the inputted mood
     */
    public Mad(String mood, Date date){
        super(mood, date);
    }

    @Override
    public String getMood(){
        return  super.getMood() + "I'm Mad ;(";
    }
}
