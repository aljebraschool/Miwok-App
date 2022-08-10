package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

//create a WordAdapter generic class that takes in our custom Word custom class
public class WordAdapter extends ArrayAdapter<Word>{

    //create a constructor of the wordAdapter that takes only two
    // parameter and use it to initialize its superclass (ArrayAdapter)
    // constructor variable
    public WordAdapter(Context context, ArrayList<Word> word)
    {
        super(context,0, word);
    }

    //Now we override the the get view method to display our two textviews
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        //check if an existing view if its being reused otherwise, inflate it
        if(convertView == null )
        {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent, false);

        }

        //get the data item for this current position view (convertView) and
        // store it in custom class variable
        Word currentWord = getItem(position);

        //find the miwok_translation textview view using convertView
        // (which is a variable of view class) using findViewById
        TextView miwok_translation = (TextView) convertView.findViewById(R.id.miwok_test_view);

        //we used our custom class object (currentWord) to access the
        //class getMiwork_translation method then used that to set
        //the text to be displayed on our text view
        miwok_translation.setText(currentWord.getMiwork_translation());

        //find the default_translation textview view using convertView
        // (which is a variable of view class) using findViewById
        TextView defalut_translation = (TextView) convertView.findViewById(R.id.defaul_text_view);

        //we used our custom class object (currentWord) to access the
        //class getdefault_translation method then used that to set
        //the text to be displayed on our text view
        defalut_translation.setText(currentWord.getDefault_translation());

        //find the image_icon text view using convertView
        //(which is a variable of view class) using findViewById
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_icon);


        //we used our custom class object (currentWord) to access the
        //class getImageIcon method then used that to set
        //the image to be displayed on our image view
        imageView.setImageResource(currentWord.getImageIcon());

        //return the populated view
        return convertView;
    }
}
