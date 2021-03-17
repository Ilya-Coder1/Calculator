package com.example.myapplication;

public class Calculator {

    private double operand;
    private char operator;
    private int priority;
    public static final int maxPriority = 1;

    public Calculator() {
        this.operand = 0;
        this.operator = ' ';
        this.priority = -1;
        System.out.println("Success");
    }

    public Calculator(String numberAndOperator) {
        this.operand = new Double(numberAndOperator.substring(0, numberAndOperator.length() - 1));
        System.out.println(operand);
        this.operator = numberAndOperator.charAt(numberAndOperator.length() - 1);
        System.out.println(operator);
        if(this.operator == '+' | this.operator == '-')
            priority = 0;
        else if(this.operator == 'x' | this.operator == '/')
            priority = 1;
        else
            priority = -1;
        System.out.println("Success");
    }

    public int getPriority() { return priority; }

    public double getNumber() { return operand; }

    public void add(Calculator n) {
        switch (operator) {
            case '+': this.operand += n.operand; break;
            case '-': this.operand -= n.operand; break;
            case 'x': this.operand *= n.operand; break;
            case '/': this.operand /= n.operand; break;
            default: return;
        }

        this.operator = n.operator;
    }
}