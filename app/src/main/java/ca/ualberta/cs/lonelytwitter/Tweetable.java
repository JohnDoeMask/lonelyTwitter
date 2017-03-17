package ca.ualberta.cs.lonelytwitter;

/**
 * This is a interface which has getMessage() method.
 *
 * @author Heyue Huang
 * @version 1.4.2
 * @since 1.0
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    // remove redundant public
     String getMessage();

    /**
     * Sets message.
     *
     * @param string the string
     * @throws TweetTooLongException the tweet too long exception
     */

    // remove redundant public
    void setMessage(String string) throws TweetTooLongException;

}
