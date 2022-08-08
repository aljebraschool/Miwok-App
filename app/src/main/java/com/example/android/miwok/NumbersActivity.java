package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //storing our numbers using an array list
        ArrayList<Word> words = new ArrayList<>();

        //adding each numbers 1-10 and its miwok translation to the words array above
        //word.add("one")
        Word w = new Word("lutti", "one");
        words.add(w);
        //repeating the process for the remaining numbers
        words.add(new Word("otiiko", "two"));
        words.add(new Word("tolookoou", "three"));
        words.add(new Word("oyyisa", "four"));
        words.add(new Word("massokka", "five"));
        words.add(new Word("temmokka", "six"));
        words.add(new Word("kenekaku", "seven"));
        words.add(new Word("kawinta", "eight"));
        words.add(new Word("wo'e", "nine"));
        words.add(new Word("na'aach", "ten"));

        /*
        * creates an Array Adapter object, itemsAdapter to convert the data source, Array list to a list view
        *  */

        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, words);



        /*
        * search for a list view called list in the activity number xml then store it as a list view in list view object
        * */

        ListView listView = (ListView) findViewById(R.id.list_item);

        /*
        * Attached the Array Adapter object to the list view object created above
        *  */
        listView.setAdapter(itemsAdapter);




    }


}