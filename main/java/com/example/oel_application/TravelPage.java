package com.example.oel_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TravelPage extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_page);
        EditText fromEditText = findViewById(R.id.from_edittext);
        EditText toEditText = findViewById(R.id.to_edittext);
        EditText dateEditText = findViewById(R.id.date_edittext);
        EditText timeEditText = findViewById(R.id.time_edittext);
        EditText priceEditText = findViewById(R.id.price_edittext);
        Spinner transportationSpinner = findViewById(R.id.transportation_spinner);
        button=findViewById(R.id.save_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String from = fromEditText.getText().toString();
                String to = toEditText.getText().toString();
                String date = dateEditText.getText().toString();
                String time = timeEditText.getText().toString();
                String priceString = priceEditText.getText().toString();

                if (from.isEmpty() || to.isEmpty() || date.isEmpty() || time.isEmpty() || priceString.isEmpty()) {
                    Toast.makeText(TravelPage.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                int price = Integer.parseInt(priceString);
                Intent intent = new Intent(TravelPage.this, CostSaving.class);
                startActivity(intent);
            }
        });
    }
}