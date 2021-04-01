package com.example.android.objectoriented;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView=(ImageView)findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
        Log.i("MainActivity.java","Image Updated");
        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView=(TextView)findViewById(R.id.status_text_view);
        textView.setText("I'm so full");
        Log.i("MainActivity.java","Text Updated");
    }
}