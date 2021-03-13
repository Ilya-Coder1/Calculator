package com.example.myapplication;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView number;
    private TextView symbol;
    private TextView firstNumber;
    private TextView secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.firstNumber = (TextView) findViewById(R.id.firstNumber);
        this.secondNumber = (TextView) findViewById(R.id.secondNumber);
        this.symbol = (TextView) findViewById(R.id.operationSymbol);
        this.number = this.firstNumber;
    }

    public void clear()
    {
        number = firstNumber;
        number.setText("");
        secondNumber.setText("");
        symbol.setText("");

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
        number = secondNumber;
    }

    public void buttonEqual(View view) {

        String first = firstNumber.getText().toString();
        String second = secondNumber.getText().toString();

        if (first == "" || second == "")
            return;

        char operator = this.symbol.getText().charAt(0);
        int n1 = Integer.parseInt(first);
        int n2 = Integer.parseInt(second);
        //System.out.println("operator: " + operator + ", n1: " + n1 + ", n2: "+ n2);

        clear();

        int res = n1;
        switch (operator) {
            case '+': res = n1 + n2; break;
            case '-': res = n1 - n2; break;
            case 'x': res = n1 * n2; break;
            case '/': res = n1 / n2; break;
        }

        firstNumber.setText(Integer.toString(res));
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
        clear();
    }
}