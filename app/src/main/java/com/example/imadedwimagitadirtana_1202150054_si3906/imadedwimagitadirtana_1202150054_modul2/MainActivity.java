package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul2;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = (RadioGroup) findViewById(R.id.pilihmenu);
        Toast.makeText(this,"I Made Dwima Gita Dirtana_1202150054",Toast.LENGTH_LONG).show();
    }

    public void goTo(View view){
        int go = radioGroup1.getCheckedRadioButtonId();
        switch (go){
            case R.id.takeaway:
                Toast.makeText(this,"Take Away",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,TakeAwayActivity.class)); break;
            case R.id.dinein:
                Toast.makeText(this,"Dine In",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,DineinActivity.class)); break;
            default:break;
        }
    }
}
