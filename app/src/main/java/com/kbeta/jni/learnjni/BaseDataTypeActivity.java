package com.kbeta.jni.learnjni;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kevin Dong on 2017/5/26.
 */
public class BaseDataTypeActivity extends AppCompatActivity {
    Button btnInt,btnFloat,btnChar;
    TextView tvInt,tvFloat,tvChar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_data_type_layout);
        btnInt = (Button) findViewById(R.id.get_int);
        btnFloat = (Button) findViewById(R.id.get_float);
        btnChar = (Button) findViewById(R.id.get_char);
        tvInt = (TextView) findViewById(R.id.set_int);
        tvFloat = (TextView) findViewById(R.id.set_float);
        tvChar = (TextView) findViewById(R.id.set_char);

        btnInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvInt.setText(String.valueOf(JniTest.getInt()));
            }
        });

        btnFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvFloat.setText(String.valueOf(JniTest.getFloat()));
            }
        });
        btnChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvChar.setText(String.valueOf(JniTest.getChar()));
            }
        });
    }
}
