package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //storing our numbers using an array list
        ArrayList<Word> words = new ArrayList<>();

        //adding each numbers 1-10 and its miwok translation to the words array list above
        //word.add("one")
        Word w = new Word("lutti", "one",R.drawable.number_one);
        words.add(w);
        //repeating the process for the remaining numbers
        words.add(new Word("otiiko", "two", R.drawable.number_two));
        words.add(new Word("tolookoou", "three", R.drawable.number_three));
        words.add(new Word("oyyisa", "four", R.drawable.number_four));
        words.add(new Word("massokka", "five", R.drawable.number_five));
        words.add(new Word("temmokka", "six", R.drawable.number_six));
        words.add(new Word("kenekaku", "seven",R.drawable.number_seven));
        words.add(new Word("kawinta", "eight", R.drawable.number_eight));
        words.add(new Word("wo'e", "nine",R.drawable.number_nine));
        words.add(new Word("na'aach", "ten",R.drawable.number_ten));

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