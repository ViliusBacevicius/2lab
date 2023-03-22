package com.example.a2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a2lab.Vilius.TextCounter;
import com.example.a2lab.Vilius.WordCounter;



public class MainActivity extends AppCompatActivity {

    private Spinner SpCoutingOptions;

    private EditText edMain;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edMain = findViewById(R.id.edMain);
        this.tvResult = findViewById(R.id.tvResult);
        this.SpCoutingOptions = (Spinner) findViewById(R.id.SpCoutingOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.SpCoutingOptions.setAdapter(adapter);
    }

    public void btnCountOnClick(View view) {
        String userInput = this.edMain.getText().toString();
        String selectedOption = this.SpCoutingOptions.getSelectedItem().toString();


        if (selectedOption.equalsIgnoreCase(getResources().getString(R.string.chars_selection))) {
            //this.tvResult.setText(String.valueOf(userInput.length()));
            this.tvResult.setText(TextCounter.getCharsCount(userInput));


        } else {
            if ((selectedOption.equalsIgnoreCase(getResources().getString(R.string.words_selection)))){

                this.tvResult.setText(WordCounter.countWords((userInput)));
            }


            else {
                Toast.makeText(getApplicationContext(), "Not Implemented", Toast.LENGTH_LONG).show();
            }
        }

    }
}


