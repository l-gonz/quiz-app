package com.example.laura.quiz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void clickLogic1 (View view) {
        RadioButton q1a1 = (RadioButton) findViewById(R.id.q1a1);
        RadioButton q1a2 = (RadioButton) findViewById(R.id.q1a2);
        RadioButton q1a3 = (RadioButton) findViewById(R.id.q1a3);
        RadioButton q1a4 = (RadioButton) findViewById(R.id.q1a4);
        RadioButton thisOne = (RadioButton) view;

        if (thisOne == q1a1 && q1a3.isChecked()) {
            q1a3.setChecked(false);
        } else if (thisOne == q1a1 && q1a4.isChecked()) {
            q1a4.setChecked(false);
        }

        if (thisOne == q1a2 && q1a3.isChecked()) {
            q1a3.setChecked(false);
        } else if (thisOne == q1a2 && q1a4.isChecked()) {
            q1a4.setChecked(false);
        }

        if (thisOne == q1a3 && q1a1.isChecked()) {
            q1a1.setChecked(false);
        } else if (thisOne == q1a3 && q1a2.isChecked()) {
            q1a2.setChecked(false);
        }

        if (thisOne == q1a4 && q1a1.isChecked()) {
            q1a1.setChecked(false);
        } else if (thisOne == q1a4 && q1a2.isChecked()) {
            q1a2.setChecked(false);
        }
    }

    public void clickLogic6 (View view) {
        RadioButton q6a1 = (RadioButton) findViewById(R.id.q6a1);
        RadioButton q6a2 = (RadioButton) findViewById(R.id.q6a2);
        RadioButton q6a3 = (RadioButton) findViewById(R.id.q6a3);
        RadioButton q6a4 = (RadioButton) findViewById(R.id.q6a4);
        RadioButton thisOne = (RadioButton) view;

        if (thisOne == q6a1 && q6a3.isChecked()) {
            q6a3.setChecked(false);
        } else if (thisOne == q6a1 && q6a4.isChecked()) {
            q6a4.setChecked(false);
        }

        if (thisOne == q6a2 && q6a3.isChecked()) {
            q6a3.setChecked(false);
        } else if (thisOne == q6a2 && q6a4.isChecked()) {
            q6a4.setChecked(false);
        }

        if (thisOne == q6a3 && q6a1.isChecked()) {
            q6a1.setChecked(false);
        } else if (thisOne == q6a3 && q6a2.isChecked()) {
            q6a2.setChecked(false);
        }

        if (thisOne == q6a4 && q6a1.isChecked()) {
            q6a1.setChecked(false);
        } else if (thisOne == q6a4 && q6a2.isChecked()) {
            q6a2.setChecked(false);
        }
    }

    public void submit(View view) {
        //Number of questions correct
        int numberOfRights = 0;

        //Question 1
        RadioButton q1a1 = (RadioButton) findViewById(R.id.q1a1);
        RadioButton q1a2 = (RadioButton) findViewById(R.id.q1a2);
        RadioButton q1a3 = (RadioButton) findViewById(R.id.q1a3);
        RadioButton q1a4 = (RadioButton) findViewById(R.id.q1a4);

        q1a3.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        if (q1a3.isChecked()) {
            numberOfRights ++;
        } else if (q1a1.isChecked()) {
            q1a1.setBackgroundColor(Color.parseColor("#BBF44336"));
        } else if (q1a2.isChecked()) {
            q1a2.setBackgroundColor(Color.parseColor("#BBF44336"));
        } else if (q1a4.isChecked()) {
            q1a4.setBackgroundColor(Color.parseColor("#BBF44336"));
        }

        //Question 2
        CheckBox q2a1 = (CheckBox) findViewById(R.id.q2a1);
        CheckBox q2a2 = (CheckBox) findViewById(R.id.q2a2);
        CheckBox q2a3 = (CheckBox) findViewById(R.id.q2a3);
        CheckBox q2a4 = (CheckBox) findViewById(R.id.q2a4);

        q2a2.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        q2a3.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        if (q2a2.isChecked() && q2a3.isChecked() && ! q2a1.isChecked() && ! q2a4.isChecked()) {
            numberOfRights ++;
        } else if (q2a1.isChecked()) {
            q2a1.setBackgroundColor(Color.parseColor("#BBF44336"));
        } else if (q2a4.isChecked()) {
            q2a4.setBackgroundColor(Color.parseColor("#BBF44336"));
        }

        //Question 3
        EditText q3a0 = (EditText) findViewById(R.id.q3a0);
        String answer3 = q3a0.getText().toString().toLowerCase();
        if (answer3.equals("iris")) {
            numberOfRights ++;
            q3a0.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        } else {
            q3a0.setBackgroundColor(Color.parseColor("#BBF44336"));
        }

        //Question 4
        CheckBox q4a1 = (CheckBox) findViewById(R.id.q4a1);
        CheckBox q4a2 = (CheckBox) findViewById(R.id.q4a2);
        CheckBox q4a3 = (CheckBox) findViewById(R.id.q4a3);
        CheckBox q4a4 = (CheckBox) findViewById(R.id.q4a4);

        q4a1.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        q4a2.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        q4a4.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        if (q4a2.isChecked() && ! q4a3.isChecked() && q4a1.isChecked() && q4a4.isChecked()) {
            numberOfRights ++;
        } else if (q4a3.isChecked()) {
            q4a3.setBackgroundColor(Color.parseColor("#BBF44336"));
        }

        //Question 5
        EditText q5a0 = (EditText) findViewById(R.id.q5a0);
        String answer5 = q5a0.getText().toString().toLowerCase();
        Log.v("MainActivity", answer5);
        if (answer5.equals("olympus") || answer5.equals("mount olympus")) {
            numberOfRights ++;
            q5a0.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        } else {
            q5a0.setBackgroundColor(Color.parseColor("#BBF44336"));
        }

        //Question 6
        RadioButton q6a1 = (RadioButton) findViewById(R.id.q6a1);
        RadioButton q6a2 = (RadioButton) findViewById(R.id.q6a2);
        RadioButton q6a3 = (RadioButton) findViewById(R.id.q6a3);
        RadioButton q6a4 = (RadioButton) findViewById(R.id.q6a4);

        q6a2.setBackgroundColor(Color.parseColor("#BB8BC34A"));
        if (q6a2.isChecked()) {
            numberOfRights ++;
        } else if (q6a1.isChecked()) {
            q6a1.setBackgroundColor(Color.parseColor("#BBF44336"));
        } else if (q6a3.isChecked()) {
            q6a3.setBackgroundColor(Color.parseColor("#BBF44336"));
        } else if (q6a4.isChecked()) {
            q6a4.setBackgroundColor(Color.parseColor("#BBF44336"));
        }

        // Show results
        if (numberOfRights == 1) {
            Toast.makeText(this, getString(R.string.toast_singular), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.toast_plural, numberOfRights), Toast.LENGTH_SHORT).show();
        }

    }
}
