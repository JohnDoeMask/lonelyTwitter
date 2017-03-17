package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by heyuehuang on 2017-03-02.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

//    public void add(NormalTweet tweet){
//        tweets.add(tweet);
//    }

    public  void addTweet(NormalTweet tweet){
        // if the tweet exits
        if(hasTweet(tweet)){
            //throw an IllegalArgumentException
            throw new IllegalArgumentException();
        } else {
            // else add the tweet
            tweets.add(tweet);
        }
    }

    // index is always 0
    public NormalTweet getTweet(){
//        return new NormalTweet("not the tweet");
        return tweets.get(0);
    }

    public ArrayList<NormalTweet> getTweets(){
        return tweets;
    }

    // check if the tweet iw already added.
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(NormalTweet tweet){
        tweets.remove(tweet);
    }

    // get the num of tweets
    public int getCount() {
        return tweets.size();
    }
}
