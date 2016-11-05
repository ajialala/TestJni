package com.example.testjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    static {
        System.loadLibrary("NdkJniUtils");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) this.findViewById(R.id.text);
        NdkJniUtils jni = new NdkJniUtils();
        mTextView.setText(String.valueOf(jni.getString()));

    }



}
