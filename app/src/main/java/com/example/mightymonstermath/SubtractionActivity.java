package com.example.mightymonstermath;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubtractionActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button subtract;
    private Button backButton; // Button to go back to MainActivity
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);

        num1 = (EditText) findViewById(R.id.editTextNumber3);
        num2 = (EditText) findViewById(R.id.editTextNumber4);
        subtract = (Button) findViewById(R.id.button3);
        backButton = (Button) findViewById(R.id.button4); // Initialize backButton
        result = (TextView) findViewById(R.id.textView);

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int subtractionResult = number1 - number2;
                result.setText("The Answer is: " + subtractionResult);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the current activity
                finish();
            }
        });
    }
}
