/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
<<<<<<< HEAD

import com.google.android.material.tabs.TabLayout;
=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
<<<<<<< HEAD
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());
=======
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager());
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

<<<<<<< HEAD
        // Give the TabLayout the ViewPager
        TabLayout tabLayout =  findViewById(R.id.sliding_tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);



=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6

    }


<<<<<<< HEAD







=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
}
