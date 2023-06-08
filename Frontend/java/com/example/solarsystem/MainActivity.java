package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{

    ArrayList<PlanetModel> planetModels = new ArrayList<>();

    int[] planetImages = {R.drawable.mercury, R.drawable.venus, R.drawable.earth,
                          R.drawable.mars, R.drawable.jupiter, R.drawable.saturn,
                          R.drawable.uranus, R.drawable.neptune};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);

        setUpPlanetModels();

        PlanetAdapter adapter = new PlanetAdapter(this, planetModels, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpPlanetModels() {
        String[] planetNames = getResources().getStringArray(R.array.planets_full_txt);
        String[] planetRadius = getResources().getStringArray(R.array.radius_txt);
        String[] planetTemp = getResources().getStringArray(R.array.temp_txt);
        String[] planetPeriod = getResources().getStringArray(R.array.period_txt);
        String[] planetMass = getResources().getStringArray(R.array.mass_txt);

        for (int i=0; i<planetNames.length; i++) {
            planetModels.add(new PlanetModel(planetNames[i], planetImages[i], planetRadius[i], planetTemp[i], planetPeriod[i], planetMass[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, PlanetActivity.class);

        intent.putExtra("NAME", planetModels.get(position).getPlanetName());
        intent.putExtra("IMAGE", planetModels.get(position).getImage());
        intent.putExtra("RADIUS", planetModels.get(position).getRadius());
        intent.putExtra("TEMP", planetModels.get(position).getTemp());
        intent.putExtra("PERIOD", planetModels.get(position).getPeriod());
        intent.putExtra("MASS", planetModels.get(position).getMass());
        startActivity(intent);
    }
}