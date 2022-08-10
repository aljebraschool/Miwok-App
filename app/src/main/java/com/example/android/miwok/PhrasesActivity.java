package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //storing our numbers using an array list
        ArrayList<Word> words = new ArrayList<>();

        //adding each pharase'a name and its miwok translation to the words array list above
        //repeating the process for the remaining numbers
        words.add(new Word("minto wuksus", "Where are you going?"));
        words.add(new Word("tinnә oyaase'nә", "What is your name"));
        words.add(new Word("oyaaset...", "My name is..."));
        words.add(new Word("michәksәs?", "How are you feeling?"));
        words.add(new Word("kuchi achit", "I'm felling good"));
        words.add(new Word("әәnәs'aa?", "Are you coming?"));
        words.add(new Word("hәә’ әәnәm", "Yes, I'm coming"));
        words.add(new Word("әәnәm", "I'm coming"));
        words.add(new Word("yoowutis", "Let's go"));
        words.add(new Word("әnni'nem", "Come here"));

        /*
         * creates an Array Adapter object, itemsAdapter to convert the data source, Array list to a list view
         *  */
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        /*
         * search for a list view called list_item in the activity
         * number xml then store it as a list view in list view object
         * */
        ListView listView = (ListView) findViewById(R.id.list);

        /*
         * Attached the Array Adapter object to the list view object created above
         *  */
        listView.setAdapter(itemsAdapter);




    }


}