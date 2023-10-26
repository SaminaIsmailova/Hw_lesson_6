package com.example.hw_lesson_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView welcom = findViewById(R.id.welcom);
        TextView textView = findViewById(R.id.text_view);
        EditText email = findViewById(R.id.et_email);
        EditText password = findViewById(R.id.et_password);
        Button button = findViewById(R.id.btn);
        TextView foggot = findViewById(R.id.text_foggot);
        TextView press = findViewById(R.id.text_press);
        TextView enter = findViewById(R.id.enter);

        password.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(getResources().getColor(R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(getResources().getColor(R.color.gray));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        button.setOnClickListener(view -> {
            String email1 = email.getText().toString();
            String password1 = password.getText().toString();
            if (email1.equals("admin") && password1.equals("admin")) {
                Toast.makeText(MainActivity.this, " Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                welcom.setVisibility(View.VISIBLE);
                textView.setVisibility(View.GONE);
                email.setVisibility(View.GONE);
                password.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                foggot.setVisibility(View.GONE);
                enter.setVisibility(View.GONE);
                press.setVisibility(View.GONE);
            } else {
                Toast.makeText(MainActivity.this, "Неверный логин и пароль", Toast.LENGTH_SHORT).show();
            }
        });
    }
}