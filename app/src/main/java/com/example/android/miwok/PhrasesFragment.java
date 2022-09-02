package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
<<<<<<< HEAD
<<<<<<<< HEAD:app/src/main/java/com/example/android/miwok/PhrasesFragment.java
=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
<<<<<<< HEAD
========
>>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6:app/src/main/java/com/example/android/miwok/PhrasesActivity.java
=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
<<<<<<< HEAD
=======
 * create an instance of this fragment.
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
 */
public class PhrasesFragment extends Fragment {

    private MediaPlayer playmusic;
<<<<<<< HEAD
<<<<<<<< HEAD:app/src/main/java/com/example/android/miwok/PhrasesFragment.java
=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
    private AudioManager audioManager;


    //declared an instance variable (completionListener) which store
    // the objects of the Mediaplayer's OnCompletionListener interface
    //to avoid creating new object everytime onCompletionListener method is called to release the memory
    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {

        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

<<<<<<< HEAD


=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
    //we declared a class variable (onAudioFocusChangeListener) which will be used to store the object of OnDudioFocusChangeListener interface
    //interface which implements onAudioFocusChange callball method for AudioManager
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {

        //implementing callback method to handle change of states of audioFocus
        @Override
        public void onAudioFocusChange(int changeFocus) {

            //checks if audiofocus was completely lost
            if(changeFocus == AudioManager.AUDIOFOCUS_LOSS)
            {
                releaseMediaPlayer(); //call releaseMediaPlayer method
            }

            //checks if audiofocus was completely gained
            else if(changeFocus == AudioManager.AUDIOFOCUS_GAIN)
            {
                playmusic.start();
            }

            //checks if audioFocus was either temporary lost due to incoming call or notifivication
            else if(changeFocus == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || changeFocus == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)
            {
                playmusic.pause();      //pause the music
                playmusic.seekTo(0); //start afresh
            }


        }
    };


<<<<<<< HEAD
=======
    public PhrasesFragment() {
        // Required empty public constructor
    }



>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
<<<<<<< HEAD
      View view = inflater.inflate(R.layout.word_list, container, false);
=======
        View rootView = inflater.inflate(R.layout.word_list, container, false);
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

        //storing our numbers using an array list
        ArrayList<Word> words = new ArrayList<>();

<<<<<<< HEAD
        //adding each pharase'a name and its miwok translation to the words array list above
        //repeating the process for the remaining numbers
        words.add(new Word("minto wuksus", "Where are you going?",R.raw.phrase_where_are_you_going));
        words.add(new Word("tinnә oyaase'nә", "What is your name", R.raw.phrase_what_is_your_name));
        words.add(new Word("oyaaset...", "My name is...", R.raw.phrase_my_name_is));
        words.add(new Word("michәksәs?", "How are you feeling?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("kuchi achit", "I'm felling good",R.raw.phrase_im_feeling_good));
        words.add(new Word("әәnәs'aa?", "Are you coming?",R.raw.phrase_are_you_coming));
        words.add(new Word("hәә’ әәnәm", "Yes, I'm coming", R.raw.phrase_yes_im_coming));
        words.add(new Word("әәnәm", "I'm coming",R.raw.phrase_im_coming));
        words.add(new Word("yoowutis", "Let's go", R.raw.phrase_lets_go));
        words.add(new Word("әnni'nem", "Come here", R.raw.phrase_come_here));
=======


        //adding each numbers 1-10 and its miwok translation to the words array list above
        //word.add("one")
        Word w = new Word("lutti", "one",R.drawable.number_one, R.raw.number_one);
        words.add(w);
        //repeating the process for the remaining numbers
        words.add(new Word("otiiko", "two", R.drawable.number_two,R.raw.number_two));
        words.add(new Word("tolookoou", "three", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("oyyisa", "four", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("massokka", "five", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("temmokka", "six", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("kenekaku", "seven",R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("kawinta", "eight", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("wo'e", "nine",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("na'aach", "ten",R.drawable.number_ten, R.raw.number_ten));

>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

        /*
         * creates an Array Adapter object, itemsAdapter to convert the data source, Array list to a list view
         *  */
<<<<<<< HEAD
        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_phrases);
=======

        WordAdapter itemsAdapter = new WordAdapter(getActivity(), words, R.color.category_numbers);


>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

        /*
         * search for a list view called list_item in the activity
         * number xml then store it as a list view in list view object
         * */
<<<<<<< HEAD
        ListView listView =  view.findViewById(R.id.list);
=======
        ListView listView =  rootView.findViewById(R.id.list);
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

        /*
         * Attached the Array Adapter object to the list view object created above
         *  */
        listView.setAdapter(itemsAdapter);


        //setting an event listener on each adapter on the list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //get the position of each arraylist object created above
                //then store that in Word variable word
                Word word = words.get(position);

                //this will release the system memory before any audio object is being created
                releaseMediaPlayer();


                //created the audioManager context servive to request for audio focus from android system
                audioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

                //request for audio focus using requestAudioFocus method
                //by passing the following parameters
                //@param onAudioFocusChangeListener : onAudioFocusChangeListener object
                //@param AudioManger.STREAM_MUSIC : constant that signifies the type of audio we are requesting
                //@param AudioManager.AUDIOFOCUS_GAIN_TRANSIENT : constant that signifies the duration of request
                int result = audioManager.requestAudioFocus(onAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                //if granted
                if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                {
                    //use the position gotten above to set the resource file for each arrayList
                    //by accessing a public method getAudiofile() in class Word
                    playmusic = MediaPlayer.create(getActivity(), word.getAudioFile());

                    //Then start playing your sound with respect to the arraylist object position
                    playmusic.start();

                    //call the setOnCompletionListener (call back method) method and
                    // pass the MediaPlayer.OnCompletionLister interface
                    // object to it after it started playing sound
                    playmusic.setOnCompletionListener(completionListener);

                }


<<<<<<< HEAD


            }
        });


        return view;
=======
            }
        });

        return rootView;

>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
    }

    //method to clean up our phone memory by releasing the class variable playmusic
    //when it's not pointing to any object in memory
    private void releaseMediaPlayer() {
        //check if the class variable object is being used to play sound
        if (playmusic != null) {
            playmusic.release();    //call the release method on it after use

            //now reassign the class variable to null to be
            // reclaimed by the phone memory
            playmusic = null;

            //abandon audio focus when it's not pointing to any object
            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        }

    }

    //method onStop used to reclaim app memory when the user leaves the app at any point
    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();

    }
<<<<<<< HEAD

========
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
    }

>>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6:app/src/main/java/com/example/android/miwok/PhrasesActivity.java

=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
}