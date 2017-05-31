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
public class StringTypeActivity extends AppCompatActivity{
    Button btnString,btnChangeString;
    TextView tvString,tvChangeString;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_data_type_layout);

        btnString = (Button) findViewById(R.id.get_string);
        tvString = (TextView) findViewById(R.id.set_string);
        btnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvString.setText(StringJniTest.getString());
            }
        });
        btnChangeString = (Button) findViewById(R.id.change_string_by_native);
        tvChangeString = (TextView) findViewById(R.id.get_changed_string_by_native);
        btnChangeString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringJniTest jniTest = new StringJniTest();
                tvChangeString.setText(jniTest.accessField());
                System.out.println(jniTest.key);
            }
        });
    }

}
