package com.dirigendo.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the first album view.
        // The final solution will do this programmatically
        ImageView firstAlbum = (ImageView) findViewById(R.id.album_1);

        // Set a click listener on that View
        firstAlbum.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the album cover clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the songs activity
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);

                // Start the songs activity
                startActivity(songsIntent);
            }
        });
    }
}
