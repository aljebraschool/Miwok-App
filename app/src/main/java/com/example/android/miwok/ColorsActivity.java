package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //storing our numbers using an array list
        ArrayList<Word> words = new ArrayList<>();

        //adding each color names and its miwok translation to the words array list above
        //repeating the process for the remaining numbers
        words.add(new Word("weṭeṭṭi", "red", R.drawable.color_red));
        words.add(new Word("chokokki", "green", R.drawable.color_green));
        words.add(new Word("ṭakaakki", "brown", R.drawable.color_brown));
        words.add(new Word("ṭopoppi", "grey", R.drawable.color_gray));
        words.add(new Word("kululli", "black", R.drawable.color_black));
        words.add(new Word("kelelli", "white", R.drawable.color_white));
        words.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow));
        words.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow));

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