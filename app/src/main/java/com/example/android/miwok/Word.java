package com.example.android.miwok;

public class Word {
    private String miwork_translation;
    private String default_translation;

    public Word (String miwork_word, String defaul_word)
    {
        miwork_translation = miwork_word;

        default_translation = defaul_word;

    }



    public String getMiwork_translation()
    {
        return  miwork_translation;
    }



    public String getDefault_translation()
    {
        return  default_translation;
    }




}
