package com.example.android.miwok;

<<<<<<< HEAD

import android.content.Context;

import androidx.annotation.Nullable;
=======
import androidx.annotation.NonNull;
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

<<<<<<< HEAD

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    //context is needed to access each string resource
    private Context context;

    
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
=======
public class CategoryAdapter extends FragmentPagerAdapter {


    public CategoryAdapter(@NonNull FragmentManager fm) {
        super(fm);
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
    }

    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

<<<<<<< HEAD
=======
    /**
     * Return the total number of pages.
     */
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
    @Override
    public int getCount() {
        return 4;
    }
<<<<<<< HEAD

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_numbers);
        } else if (position == 1) {
            return context.getString(R.string.category_family);
        } else if (position == 2) {
            return context.getString(R.string.category_colors);
        } else {
            return context.getString(R.string.category_phrases);
        }

    }



=======
>>>>>>> 09273ea512c49d09a0aa99e882e52cc8354b0bf6
}
