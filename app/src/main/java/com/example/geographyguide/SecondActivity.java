package com.example.geographyguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    // поля
    private ImageButton arrow;
    private ImageButton flag;
    private ImageButton attractions;
    private ImageButton currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // присваивание id
        arrow = findViewById(R.id.arrow);
        flag = findViewById(R.id.flag);
        attractions = findViewById(R.id.attractions);
        currency = findViewById(R.id.currency);

        // обработка нажатия кнопки
        arrow.setOnClickListener(listener);
        flag.setOnClickListener(listener);
        attractions.setOnClickListener(listener);
        currency.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.flag:
                    Intent intentFlag = new Intent(getApplicationContext(), FlagActivity.class);
                    intentFlag.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(intentFlag);
                    break;
                case R.id.attractions:
                    Intent intentAttractions = new Intent(getApplicationContext(), AttractionsActivity.class);
                    intentAttractions.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(intentAttractions);
                    break;
                case R.id.currency:
                    Intent intentCurrency = new Intent(getApplicationContext(), CurrencyActivity.class);
                    intentCurrency.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(intentCurrency);
                    break;
                case R.id.arrow:
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(intent);
                    break;

            }
        }

    };
}