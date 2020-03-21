package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    private Button submitButton;
    private int score;
    private RadioGroup numTwoRadioGroup;
    private RadioGroup numFiveRadioGroup;
    private RadioGroup numOneRadioGroup;
    private EditText editText;
    private CheckBox RastraCheckbox;
    private CheckBox NepalCheckbox;
    private CheckBox KistCheckbox;
    private CheckBox KumariCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton = findViewById(R.id.submit_button);
        editText = findViewById(R.id.edit_text);
        RastraCheckbox = findViewById(R.id.Rastra_checkbox);
        NepalCheckbox = findViewById(R.id.Nepal_checkbox);
        KistCheckbox = findViewById(R.id.Kist_checkbox);
        KumariCheckbox = findViewById(R.id.Kumari_checkbox);
        numOneRadioGroup = findViewById(R.id.num_one_radio_group);
        numTwoRadioGroup = findViewById(R.id.num_two_radio_group);
        numFiveRadioGroup = findViewById(R.id.num_five_radio_group);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score = 0;

                if (numOneRadioGroup.getCheckedRadioButtonId() == R.id.Gynendra_radio){
                    score += 1;
                }

                if (numTwoRadioGroup.getCheckedRadioButtonId() == R.id.Kathmandu_radio){
                    score += 1;
                }

                if (numFiveRadioGroup.getCheckedRadioButtonId() == R.id.seven_radio){
                    score += 1;
                }

                String userAnswer = editText.getText().toString();
                if (userAnswer.equalsIgnoreCase("Ram Baran Yadav")){
                    score += 1;
                }

                if (NepalCheckbox.isChecked() ){
                    score += 1;
                }

                Intent  intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE", score+"/5");
                startActivity(intent);
            }
        });
    }
}

