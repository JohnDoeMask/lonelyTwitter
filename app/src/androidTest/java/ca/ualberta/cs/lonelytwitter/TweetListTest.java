package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by heyuehuang on 2017-02-16.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testAddTweet2(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Test adding a duplicate tweet");
        // add the new tweet
        tweets.addTweet(tweet);
        try{
            // add the same tweet
            tweets.addTweet(tweet);
            fail();
            // if there is a IllegalArgument exception
        } catch(IllegalArgumentException exception){
        }
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetTweets(){
        ArrayList<NormalTweet> tweetList = new ArrayList<NormalTweet>();
        TweetList tweets = new TweetList();

        // add two tweets using addTweet()
        NormalTweet tweet = new NormalTweet("first test tweet");
        NormalTweet tweet2 = new NormalTweet("second test tweet");
        tweets.addTweet(tweet);
        tweets.addTweet(tweet2);

        // add two tweets into the tweetList
        tweetList.add(tweet);
        tweetList.add(tweet2);

        // get the return result of getTweet()
        ArrayList<NormalTweet> returnedTweet = tweets.getTweets();
        // the two lists supposes be equal
        assertEquals(returnedTweet, tweetList);
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }


    public void testGetCount(){
        TweetList tweets = new TweetList();

        // add 3 tweets
        NormalTweet tweet = new NormalTweet("first test tweet");
        NormalTweet tweet2 = new NormalTweet("second test tweet");
        NormalTweet tweet3 = new NormalTweet("third test tweet");

        tweets.addTweet(tweet);
        tweets.addTweet(tweet2);
        tweets.addTweet(tweet3);

        // the reult of getCount supposes be 3
        assertEquals(tweets.getCount(), 3);
    }


}
