package com.example.oel_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class CarDetails extends AppCompatActivity {

    private ImageView image;
    private Spinner fareSpinner, tripSpinner, transportationSpinner;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        image = findViewById(R.id.image);
        fareSpinner = findViewById(R.id.fare_spinner);
        tripSpinner = findViewById(R.id.trip_spinner);
        transportationSpinner = findViewById(R.id.transportation_spinner);
        saveButton = findViewById(R.id.save_button);

        image.setImageResource(R.drawable.card_image);

        // Set options for spinners
        String[] fareOptions = {"Fare 1", "Fare 2", "Fare 3"};
        String[] tripOptions = {"Trip 1", "Trip 2", "Trip 3"};
        String[] transportationOptions = {"Transportation 1", "Transportation 2", "Transportation 3"};

        ArrayAdapter<String> fareAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fareOptions);
        fareSpinner.setAdapter(fareAdapter);

        ArrayAdapter<String> tripAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tripOptions);
        tripSpinner.setAdapter(tripAdapter);

        ArrayAdapter<String> transportationAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, transportationOptions);
        transportationSpinner.setAdapter(transportationAdapter);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fareValue = fareSpinner.getSelectedItem().toString();
                String tripValue = tripSpinner.getSelectedItem().toString();
                String transportationValue = transportationSpinner.getSelectedItem().toString();

                Intent intent=new Intent(CarDetails.this,TravelPage.class);
                startActivity(intent);
            }
        });
    }
}