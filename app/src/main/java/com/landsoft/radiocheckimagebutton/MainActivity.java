package com.landsoft.radiocheckimagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton radio_btn_gay,radio_btn_less;
    CheckBox  cb_purple,cb_pink,cb_introvert,cb_cry;
    ImageButton img_button;
    TextView  tv_result;
    String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        temp = String.valueOf(tv_result.getText());

        img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radio_btn_gay.isChecked()){
                    temp = temp + " Tôi là " + radio_btn_gay.getText().toString() + " ";
                }else {
                    temp = temp + " Tôi là " + radio_btn_less.getText().toString()+ " ";
                }

                if (cb_purple.isChecked()){
                    temp = temp + cb_purple.getText().toString()+ " ";
                }
                if (cb_pink.isChecked()){
                    temp = temp + cb_pink.getText().toString()+ " ";
                }
                if (cb_introvert.isChecked()){
                    temp = temp + cb_introvert.getText().toString()+ " ";
                }
                if (cb_introvert.isChecked()){
                    temp = temp + cb_introvert.getText().toString()+ " ";
                }
                tv_result.setText(temp);
                temp="";
            }
        });

    }

    private void initWidget(){
        radio_btn_gay = findViewById(R.id.radio_btn_gay);
        radio_btn_less = findViewById(R.id.radio_btn_less);
        cb_purple = findViewById(R.id.cb_purple);
        cb_pink = findViewById(R.id.cb_pink);
        cb_introvert = findViewById(R.id.cb_introvert);
        cb_cry = findViewById(R.id.cb_cry);
        img_button = findViewById(R.id.img_button);
        tv_result = findViewById(R.id.tv_result);
    }
}
