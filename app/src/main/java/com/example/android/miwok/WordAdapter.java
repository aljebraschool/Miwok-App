package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

//create a WordAdapter generic class that takes in our custom Word custom class
public class WordAdapter extends ArrayAdapter<Word>{



    //declare a global variable @backgroundColor that can be used to store
    // the color of a particular wordAdapter object
    // (i.e, this changes based on the class instantiating word adapter class object)
    private int backgroungColor;

    //create a constructor of the wordAdapter that takes
    // three parameters and use it to initialize its superclass (ArrayAdapter)
    // constructor variable and it class variable @param backgroundColor
    public WordAdapter(Context context, ArrayList<Word> word, int color)
    {
        super(context,0, word);
        backgroungColor = color;
    }





    //Now we override  the get view method to display our two textviews
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        //check if an existing view its being reused otherwise, inflate it
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
        if(currentWord.hasImage() == true) {
            //set image with the text if returned value from hasImage method is true
            imageView.setImageResource(currentWord.getImageIcon());

            //make sure it's visible
            imageView.setVisibility(View.VISIBLE);
        }

        //otherwise hides it completely
        else
            imageView.setVisibility(View.GONE);


        //using convertView which is an object of class View, we use it to
        // access the findViewById method in order to get the root layout container (text_container)
        //which is the layout that contains the two textviews that we are trying to set their background color
        View textContainer = convertView.findViewById(R.id.text_container);

        //we get the color via backgroundColor instance variable
        // assigned to the object of class WordAdapter when created
        //then store the return color value in color variable
        int color = ContextCompat.getColor(getContext(), backgroungColor);

        //we set the textContainer layout found above to the color gotten from the object
        textContainer.setBackgroundColor(color);






//        ImageButton playButton =  convertView.findViewById(R.id.play_icon);
//        playButton.setVisibility(View.VISIBLE);

        //return the populated view
        return convertView;
    }
}
