package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        String name = getIntent().getStringExtra("NAME");
        int image = getIntent().getIntExtra("IMAGE", 0);
        String radius = getIntent().getStringExtra("RADIUS");
        String temp = getIntent().getStringExtra("TEMP");
        String period = getIntent().getStringExtra("PERIOD");
        String mass = getIntent().getStringExtra("MASS");

        TextView nameTextView = findViewById(R.id.textViewP);
        ImageView planetImage = findViewById(R.id.imageViewP);
        TextView radiusText = findViewById(R.id.radiusText);
        TextView tempText = findViewById(R.id.tempText);
        TextView periodText = findViewById(R.id.periodText);
        TextView massText = findViewById(R.id.massText);

        nameTextView.setText(name);
        planetImage.setImageResource(image);
        radiusText.setText(radius);
        tempText.setText(temp);
        periodText.setText(period);
        massText.setText(mass);

        Button backButton = findViewById(R.id.myButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
    }

    private void changeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
