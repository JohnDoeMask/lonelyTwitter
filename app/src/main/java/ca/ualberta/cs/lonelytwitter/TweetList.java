package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by heyuehuang on 2017-02-16.
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

    public NormalTweet getTweet(int index){
//        return new NormalTweet("not the tweet");
        return tweets.get(index);
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
