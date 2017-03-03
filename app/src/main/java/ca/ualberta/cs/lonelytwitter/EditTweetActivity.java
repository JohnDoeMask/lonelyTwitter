package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

public class EditTweetActivity extends Activity {
    private ListView theTweet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        String tweet = intent.getStringExtra("thetweet");
        TextView viewthetweet = (TextView) findViewById(R.id.textView);

        viewthetweet.setText(tweet);



    }
}
