package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by heyuehuang on 2017-02-01.
 */

public class Happy extends Mood {

    /**
     * A Happy mood
     *
     * @param date       the inputted date
     */
    public Happy(Date date){
        super(date);
    }

    /**
     * A Happy mood
     *
     * @param date       the inputted date
     * @param mood       the inputted mood
     */
    public Happy(String mood, Date date){
        super(mood, date);
    }

    @Override
    public String getMood() {
        return  super.getMood() + "I'm happy : )";
    }
}
