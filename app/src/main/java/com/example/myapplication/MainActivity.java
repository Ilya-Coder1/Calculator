package com.example.myapplication;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = findViewById(R.id.textView);
    }

    public void button0(View view) {
        textView.append("0");
    }

    public void button1(View view) {
        textView.append("1");
    }

    public void button2(View view) {
        textView.append("2");
    }

    public void button3(View view) {
        textView.append("3");
    }

    public void button4(View view) {
        textView.append("4");
    }

    public void button5(View view) {
        textView.append("5");
    }

    public void button6(View view) {
        textView.append("6");
    }

    public void button7(View view) {
        textView.append("7");
    }

    public void button8(View view) {
        textView.append("8");
    }

    public void button9(View view) {
        textView.append("9");
    }

    public void buttonComma(View view) {
        textView.append(",");
    }

    public void buttonPlus(View view) {
        textView.append("+");
    }

    public void buttonEqual(View view) {
    }

    public void buttonMinus(View view) {
        textView.append("-");
    }

    public void buttonMul(View view) {
        textView.append("x");
    }

    public void buttonDiv(View view) {
        textView.append("/");
    }

    public void buttonDel(View view) {
        textView.clearComposingText();
    }
}