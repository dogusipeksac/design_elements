package com.example.design_elements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox statusCheckBox;
    RadioButton radioButtonMale;
    RadioButton radioButtonFemale;
    Switch switchGrad;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        statusCheckBox=findViewById(R.id.checkBoxStatus);
        radioButtonMale=findViewById(R.id.radioButtonMale);
        radioButtonFemale=findViewById(R.id.radioButtonFemale);
        switchGrad=findViewById(R.id.gradSwitch);
        resultText=findViewById(R.id.resultText);

    }

    public void buttonCheck(View view) {
    String result="";
    if(statusCheckBox.isChecked())
        result="he is married,";
    else
        result="he is not  married,";

    if (radioButtonMale.isChecked())
        result+="also he is male,";

    else
        result+="also he is female,";
    if(switchGrad.isChecked())
        result+="also this student is grade";
    else
        result+="also this student is not grade";

    resultText.setText(result);
    }
}