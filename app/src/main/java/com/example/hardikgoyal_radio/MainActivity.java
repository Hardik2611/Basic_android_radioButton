package com.example.hardikgoyal_radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1,rg2;
    Button b1,b2;
    TextView t1,t2,t3;
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = findViewById(R.id.radioGroup);
        rg2 = findViewById(R.id.radioGroup1);
        t1 = findViewById(R.id.textView3);
        t2 = findViewById(R.id.textView);
        t3 = findViewById(R.id.textView2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton2);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r = findViewById(i);
                t2.setText(r.getText());
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = rg2.getCheckedRadioButtonId();
                if(i==-1){
                    t3.setText("Nothing Selected");
                }else{
                    RadioButton r = findViewById(i);
                    t3.setText(r.getText());
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rg2.clearCheck();
                t3.setText("Cleared");
            }
        });
    }
    public void onRadioButtonClicked(View view){
        if (r1.isChecked()){
            t1.setText(r1.getText());
            r1.setChecked(false);
        }
        if (r2.isChecked()){
            t1.setText(r2.getText());
            r2.setChecked(false);
        }
    }
}