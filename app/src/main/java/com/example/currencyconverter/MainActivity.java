package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Convertor();

    }



    private void Convertor() {
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.pk);
                TextView textView = findViewById(R.id.tv);
                float PKR = Float.parseFloat(editText.getText().toString());
                float result = PKR / 219;
                textView.setText(String.valueOf(result) + "$");
            }
        });

    }
}