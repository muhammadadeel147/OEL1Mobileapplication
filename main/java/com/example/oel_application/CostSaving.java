package com.example.oel_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CostSaving extends AppCompatActivity {

    EditText voucherCodeEditText;
    Button enterButton, goBackButton,button;
    TextView successTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_saving2);

        voucherCodeEditText = findViewById(R.id.voucher_code_edit_text);
        enterButton = findViewById(R.id.enterButton);
        goBackButton = findViewById(R.id.backButton);
        button=findViewById(R.id.button3);
        successTextView = findViewById(R.id.textView);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String voucherCode = voucherCodeEditText.getText().toString().trim();

                if (voucherCode.isEmpty()) {
                    voucherCodeEditText.setError("Please enter a voucher code");
                    return;
                }
                successTextView.setText("You have successfully obtained a discount!");
            }
        });

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CostSaving.this, CarDetails.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                successTextView.setText("You have successfully Booked a vehicle");
            }
        });
    }
}
