package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayTextView = (TextView) findViewById(R.id.tv_display);
    }
}


// done (1) Use Android Studio's Activity wizard to create a new Activity called ChildActivity

// Do steps 6 & 7 in ChildActivity.java
// done (6) Create a TextView field to display your message
// done (7) Get a reference to your TextView in Java