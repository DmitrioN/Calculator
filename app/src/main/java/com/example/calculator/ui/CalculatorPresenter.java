package com.example.calculator.ui;

import android.annotation.SuppressLint;
import com.example.calculator.R;


public class CalculatorPresenter {

    private int firstArg;
    private int secondArg;

    private StringBuilder inputStr = new StringBuilder();
    private int actionSelected;
    private State state;


    private enum State {
        firstArgInput,
        operationSelected,
        secondArgInput,
        resultShow
    }

    public CalculatorPresenter() {
        state = State.firstArgInput;
    }

    public void onNumPressed(int buttonId) {

        if (state == State.resultShow) {
            state = State.firstArgInput;
            inputStr.setLength(0);
        }

        if (state == State.operationSelected) {
            state = State.secondArgInput;
            inputStr.setLength(0);
        }

        if (inputStr.length() < 9) {
            switch (buttonId) {
                case R.id.buttonZero:
                    if (inputStr.length() != 0) {
                        inputStr.append("0");
                    }
                    break;
                case R.id.buttonOne:
                    inputStr.append("1");
                    break;
                case R.id.buttonTwo:
                    inputStr.append("2");
                    break;
                case R.id.buttonThree:
                    inputStr.append("3");
                    break;
                case R.id.buttonFour:
                    inputStr.append("4");
                    break;
                case R.id.buttonFive:
                    inputStr.append("5");
                    break;
                case R.id.buttonSix:
                    inputStr.append("6");
                    break;
                case R.id.buttonSeven:
                    inputStr.append("7");
                    break;
                case R.id.buttonEight:
                    inputStr.append("8");
                    break;
                case R.id.buttonNine:
                    inputStr.append("9");
                    break;
            }
        }

    }

    public void onActionPressed(int actionId) {
        if (actionId == R.id.buttonEqually && state == State.secondArgInput && inputStr.length() > 0) {
            secondArg = Integer.parseInt(inputStr.toString());
            state = State.resultShow;
            inputStr.setLength(0);
            switch (actionSelected) {
                case R.id.buttonFold:
                    inputStr.append(firstArg + secondArg);
                    break;
                case R.id.buttonMinus:
                    inputStr.append(firstArg - secondArg);
                    break;
                case R.id.buttonMultiply:
                    inputStr.append(firstArg * secondArg);
                    break;
                case R.id.buttonShare:
                    inputStr.append(firstArg / secondArg);
                    break;
            }

        } else if (inputStr.length() > 0 && state == State.firstArgInput) {
            firstArg = Integer.parseInt(inputStr.toString());
            state = State.operationSelected;
            actionSelected = actionId;
        }
    }

    public String getText() {
        StringBuilder str = new StringBuilder();
        switch (state) {
            default:
                return inputStr.toString();
            case operationSelected:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .toString();
            case secondArgInput:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .append(' ')
                        .append(inputStr)
                        .toString();
            case resultShow:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .append(' ')
                        .append(secondArg)
                        .append(" = ")
                        .append(inputStr.toString())
                        .toString();
        }
    }

    private char getOperationChar() {
        switch (actionSelected) {
            case R.id.buttonFold:
                return '+';
            case R.id.buttonMinus:
                return '-';
            case R.id.buttonMultiply:
                return '*';
            case R.id.buttonShare:
            default:
                return '/';

        }
    }

    public void reset() {
        state = State.firstArgInput;
        inputStr.setLength(0);
    }
}
