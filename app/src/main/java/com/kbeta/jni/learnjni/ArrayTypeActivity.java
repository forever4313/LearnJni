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
public class ArrayTypeActivity extends AppCompatActivity{
    Button btnString;
    TextView tvString;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array_data_type_layout);

        btnString = (Button) findViewById(R.id.get_arr_sum);
        tvString = (TextView) findViewById(R.id.set_resl);
        final int[] arr = {1,2,3,4,5,6,7,8};
        btnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvString.setText(String.valueOf(ArrayJniTest.getSumOfArray(arr,8)));
            }
        });
    }

}
