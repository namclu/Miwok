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
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_layout);

        // An ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();

        // Add Strings element to words ArrayList
        words.add(new Word("father", "әpә", R.drawable.family_father));
        words.add(new Word("mother","әṭa", R.drawable.family_mother));
        words.add(new Word("son","angsi", R.drawable.family_son));
        words.add(new Word("daughter","tune", R.drawable.family_daughter));
        words.add(new Word("older brother","taachi", R.drawable.family_older_brother));
        words.add(new Word("younger brother","chalitti", R.drawable.family_younger_brother));
        words.add(new Word("older sister","teṭe", R.drawable.family_older_sister));
        words.add(new Word("younger sister","kolliti", R.drawable.family_younger_sister));
        words.add(new Word("grandmother","ama", R.drawable.family_grandmother));
        words.add(new Word("grandfather","paapa", R.drawable.family_grandfather));

        // An ArrayAdapter whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single TextView, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list_layout.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
