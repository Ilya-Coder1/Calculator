package com.example.myapplication;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private TextView number;
    private int index;
    //private TextView symbol;
    //private TextView firstNumber;
    //private TextView secondNumber;
    private boolean commaIsSet;
    private ArrayList<Calculator> numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.number = (TextView) findViewById(R.id.number);
        numbers = new ArrayList<Calculator>();
        commaIsSet = false;
        index = 0;
    }

    String convertToString()
    {
        String s = this.number.getText().toString().substring(index);
        System.out.println(s);
        index += s.length();
        return s;
    }

    public void clear()
    {
        number.setText("");
        commaIsSet = false;
        index = 0;
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
        if(!commaIsSet)
            number.append(".");
        commaIsSet = true;
    }

    public void buttonPlus(View view) {
        number.append("+");
        Calculator a = new Calculator(convertToString());
        System.out.println("Success");
        numbers.add(a);
    }

    public void buttonEqual(View view) {
        number.append("=");
        numbers.add(new Calculator(convertToString()));
        System.out.println(numbers.get(0).getPriority());
        int j;
        for (int i = Calculator.maxPriority; i >= 0; i--) {
            System.out.println(i);
            j = 0;
            while (j < numbers.size()) {
                if(numbers.get(j).getPriority() == i)
                    numbers.get(j).add(numbers.remove(j + 1));
                j++;
            }
        }
       clear();

        number.setText(numbers.get(0).getNumber() + "");
        numbers.clear();
    }

    public void buttonMinus(View view) {
        number.append("-");
        numbers.add(new Calculator(convertToString()));
    }

    public void buttonMul(View view) {
        number.append("x");
        numbers.add(new Calculator(convertToString()));
    }

    public void buttonDiv(View view) {
        number.append("/");
        numbers.add(new Calculator(convertToString()));
    }

    public void buttonDel(View view) {
        clear();
    }
}