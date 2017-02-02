package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by heyuehuang on 2017-02-01.
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
