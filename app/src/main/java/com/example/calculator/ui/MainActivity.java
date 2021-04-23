package com.example.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.calculator.R;
import com.example.calculator.domain.CalculatorImpl;

public class MainActivity extends AppCompatActivity implements CalculatorView  {

    private CalculatorPresenter presenter;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.textView);
        presenter = new CalculatorPresenter(this, new CalculatorImpl());
        findViewById(R.id.buttonOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonOneClicked();

            }
        });
        findViewById(R.id.buttonTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonTwoClicked();

            }
        });
        findViewById(R.id.buttonThree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonThreeClicked();

            }
        });
        findViewById(R.id.buttonFour).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonFourClicked();

            }
        });
        findViewById(R.id.buttonFife).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonFifeClicked();

            }
        });
        findViewById(R.id.buttonSix).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonSixClicked();

            }
        });
        findViewById(R.id.buttonSeven).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonSevenClicked();

            }
        });
        findViewById(R.id.buttonEight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonEightClicked();

            }
        });
        findViewById(R.id.buttonNine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonNineClicked();

            }
        });
        findViewById(R.id.buttonPoint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonPointClicked();

            }
        });
        findViewById(R.id.buttonZero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonZeroClicked();

            }
        });
        findViewById(R.id.buttonEqually).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonEquallyClicked();

            }
        });
        findViewById(R.id.buttonDelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonDeleteClicked();

            }
        });
        findViewById(R.id.buttonClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonClearClicked();

            }
        });
        findViewById(R.id.buttonPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonPercentClicked();

            }
        });
        findViewById(R.id.buttonFold).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonFoldClicked();

            }
        });
        findViewById(R.id.buttonMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonMinusClicked();

            }
        });
        findViewById(R.id.buttonMultiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonMultiplyClicked();

            }
        });
        findViewById(R.id.buttonShare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.ButtonShareClicked();

            }
        });
    }


    @Override
    public void showResult(String result) {

        resultText.setText(result);

    }
}