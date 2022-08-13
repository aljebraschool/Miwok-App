package com.example.android.miwok;

/*
 * Implementing a custom class to instantiate two text view texts
 * needed for our text view
 * */
public class Word {

    //declaring class variables to be used for the textview
    private String miwork_translation;
    private String default_translation;


    //assigning the image resource value to the image icon by default (No image found with text)
    private int imageIcon = NO_IMAGE;

    //declaring a constant class variable to check if there's image resource
    private static final int NO_IMAGE = -1;

    //declaring an instance variable for the sudio file
    private int audioFile;

    //declaring a constructor that takes four parameters to initialize the class variables
    public Word(String miwork_word, String defaul_word, int image, int audio) {
        miwork_translation = miwork_word;
        default_translation = defaul_word;
        imageIcon = image;
        audioFile = audio;

    }


    //declaring a constructor that takes three parameters to initialize the class variables
    public Word(String miwork_word, String defaul_word, int audio) {
        miwork_translation = miwork_word;
        default_translation = defaul_word;
        audioFile = audio;
    }


    //returning the value stored in miwork_translation variable
    public String getMiwork_translation() {
        return miwork_translation;
    }

    //returning the value stored in default_translation variable
    public String getDefault_translation() {
        return default_translation;
    }

    //returning the image in the image icon variable
    public int getImageIcon() {
        return imageIcon;
    }

    //returning the audio  in the audio file variable
    public int getAudioFile() {
        return audioFile;
    }

    //creating a method that will check if there's image attached with a text or not
    public boolean hasImage() {
        //compare the values in both variables to check if there's an image with associated with a  text
        if (imageIcon == NO_IMAGE)
            return false; // value is -1 so no image
        else
            return true; // values are not equal (e.g, 1, 0, 2...) so there's image
    }


}
