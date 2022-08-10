package com.example.android.miwok;

/*
* Implementing a custom class to instantiate two text view texts
* needed for our text view
* */
public class Word {

    //declaring class variables to be used for the textview
    private String miwork_translation;
    private String default_translation;
    private int imageIcon;

    //declaring a constructor to initialize the class variables
    public Word (String miwork_word, String defaul_word, int image)
    {
        miwork_translation = miwork_word;
        default_translation = defaul_word;
        imageIcon = image;
    }

    //declaring a constructor to initialize the class variables
    public Word (String miwork_word, String defaul_word)
    {
        miwork_translation = miwork_word;
        default_translation = defaul_word;

    }



    //returning the value stored in miwork_translation variable
    public String getMiwork_translation()
    {
        return  miwork_translation;
    }

    //returning the value stored in default_translation variable
    public String getDefault_translation()
    {
        return  default_translation;
    }

    //returning the image in the image icon variable
    public int getImageIcon()
    {
        return  imageIcon;
    }




}
