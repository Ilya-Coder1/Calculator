package com.example.myapplication;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView number;
    private TextView symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.number = (TextView) findViewById(R.id.firstNumber);
        this.symbol = (TextView) findViewById(R.id.operationSymbol);
    }

    public void button0(View view) {
        number.append("0");
    }

    public void button1(View view) {
        number.append("1");
    }

    public void button2(View view) {
        number.append("2");
    }

    public void button3(View view) {
        number.append("3");
    }

    public void button4(View view) {
        number.append("4");
    }

    public void button5(View view) {
        number.append("5");
    }

    public void button6(View view) {
        number.append("6");
    }

    public void button7(View view) {
        number.append("7");
    }

    public void button8(View view) {
        number.append("8");
    }

    public void button9(View view) {
        number.append("9");
    }

    public void buttonComma(View view) {
        //symbol.setText(",");
    }

    public void buttonPlus(View view) {
        symbol.setText("+");
        number = (TextView) findViewById(R.id.secondNumber);
    }

    public void buttonEqual(View view) {
    }

    public void buttonMinus(View view) {
        symbol.setText("-");
        number = (TextView) findViewById(R.id.secondNumber);
    }

    public void buttonMul(View view) {
        symbol.setText("x");
        number = (TextView) findViewById(R.id.secondNumber);
    }

    public void buttonDiv(View view) {
        symbol.setText("/");
        number = (TextView) findViewById(R.id.secondNumber);
    }

    public void buttonDel(View view) {
        number = (TextView)findViewById(R.id.firstNumber);
        number.setText("");
        ((TextView)findViewById(R.id.secondNumber)).setText("");
        ((TextView)findViewById(R.id.operationSymbol)).setText("");
    }
}