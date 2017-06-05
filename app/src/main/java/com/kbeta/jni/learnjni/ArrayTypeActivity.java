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
    Button btnString,btnGenerateArr,btnSortArr;
    TextView tvString,tvGenerateArr,tvSortResl;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array_data_type_layout);

        btnString = (Button) findViewById(R.id.get_arr_sum);
        btnGenerateArr = (Button) findViewById(R.id.generate_arr_btn);
        btnSortArr = (Button) findViewById(R.id.sort_arr_btn);

        tvString = (TextView) findViewById(R.id.set_resl);
        tvGenerateArr = (TextView) findViewById(R.id.generate_arr_string);
        tvSortResl = (TextView) findViewById(R.id.sort_arr_btn_resl);

        final int[] arr = {1,2,3,4,5,6,7,8};
        btnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvString.setText(String.valueOf(ArrayJniTest.getSumOfArray(arr,8)));
            }
        });
        btnGenerateArr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int size  =3;
                int[][]  res= ArrayJniTest.initInt2DArray(size);
                String rlt ="[\n";
                for(int i=0;i<size;i++){
                    rlt = rlt +"[";
                    for(int j =0;j<size;j++){
                        rlt = rlt + res[i][j]+",";
                    }
                    rlt = rlt + "]\n";

                }
                rlt = rlt +"]";
                tvGenerateArr.setText(rlt);
            }
        });

        btnSortArr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] originArr = {8,2,1,3,9,10,1};
                int[] sortResult = ArrayJniTest.sortIntArray(originArr);
                String res = "[";
                for(int i =0;i< sortResult.length;i++){
                    if(i!=sortResult.length -1){
                        res = res +sortResult[i]+",";
                    }else{
                        res = res + sortResult[i];
                    }

                }
                res = res +"]";
                tvSortResl.setText(res);
            }
        });

    }

}
