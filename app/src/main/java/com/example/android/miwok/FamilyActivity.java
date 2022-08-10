package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //storing our numbers using an array list
        ArrayList<Word> words = new ArrayList<>();

        //adding each family names and its miwok translation to the words array list above
        //repeating the process for the remaining numbers
        words.add(new Word("әpә", "Father?", R.drawable.family_father));
        words.add(new Word("әṭa", "Mother", R.drawable.family_mother));
        words.add(new Word("angsi", "Son", R.drawable.family_son));
        words.add(new Word("tune", "Daughter", R.drawable.family_daughter));
        words.add(new Word("taachi", "Older brother",R.drawable.family_older_brother));
        words.add(new Word("chalitti", "Younger brother", R.drawable.family_younger_sister));
        words.add(new Word("teṭe", "Older sister", R.drawable.family_older_sister));
        words.add(new Word("kolliti", "Younger sister", R.drawable.family_younger_sister));
        words.add(new Word("ama", "Grandmother", R.drawable.family_grandmother));
        words.add(new Word("paapa", "Grandfather", R.drawable.family_grandfather));

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