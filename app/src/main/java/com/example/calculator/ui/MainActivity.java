package com.example.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.calculator.R;


public class MainActivity extends AppCompatActivity {

    private CalculatorPresenter presenter;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textView);

        int[] numberIds = new int[]{
                R.id.buttonZero,
                R.id.buttonOne,
                R.id.buttonTwo,
                R.id.buttonThree,
                R.id.buttonFour,
                R.id.buttonFive,
                R.id.buttonSix,
                R.id.buttonSeven,
                R.id.buttonEight,
                R.id.buttonNine
        };

        int[] actionsIds = new int[]{
                R.id.buttonFold,
                R.id.buttonMinus,
                R.id.buttonMultiply,
                R.id.buttonShare,
                R.id.buttonEqually
        };

        result = findViewById(R.id.text);

        presenter = new CalculatorPresenter();

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onNumPressed(view.getId());
                result.setText(presenter.getText());
            }
        };

        View.OnClickListener actionButtonOnclickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onActionPressed(view.getId());
                result.setText(presenter.getText());
            }
        };

        for (int i = 0; i < numberIds.length; i++) {
            findViewById(numberIds[i]).setOnClickListener(numberButtonClickListener);
        }

        for (int i = 0; i < actionsIds.length; i++) {
            findViewById(actionsIds[i]).setOnClickListener(actionButtonOnclickListener);
        }

        findViewById(R.id.buttonClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.reset();
                result.setText(presenter.getText());
            }
        });
    }

}