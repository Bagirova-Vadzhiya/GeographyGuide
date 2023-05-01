package com.example.geographyguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class CurrencyActivity extends AppCompatActivity {

    private ImageButton arrow;

    List<Flags> flag = new ArrayList<Flags>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        arrow = findViewById(R.id.arrow);

        arrow.setOnClickListener(listener);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_flag);

        FlagAdapter adapter = new FlagAdapter( this, flag);

        recyclerView.setAdapter(adapter);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        }
    };

    private void setInitialData() {
        flag.add(new Flags(" Австралийский доллар, $ (AUD)", "Валюта Австралийского Союза, включая Острова Рождества, Кокосовые острова и Острова Норфолк, а также независимых тихоокеанских государств Кирибати, Науру и Тувалу. Делится на 100 центов.",
                R.drawable.auscur, ""));
        flag.add(new Flags("Бразильский реал, R$ (BRL)", "Денежная единица Бразилии. Делится на 100 сентаво. Является относительно новой валютой. Появлению реала в 1994 году предшествовал период гиперинфляции.",
                R.drawable.bracur, ""));
        flag.add(new Flags("Канадский доллар, $ или C$", "Денежная единица Канады. Введена в 1858 году. Один канадский доллар состоит из 100 центов. В 2007 году канадский доллар занимал 7-е место среди мировых валют, наиболее активно торгуемых на валютном рынке.",
                R.drawable.cancur, ""));
        flag.add(new Flags(" Российский рубль, ₽ RUB", "Денежная единица Российской Федерации. На территории Российской Федерации использование других валют резидентами, с некоторыми исключениями, наказывается штрафом в размере от трёх четвертей до одного размера транзакции.",
                R.drawable.ruscur, ""));
        flag.add(new Flags( "Южноафриканский рэнд, R (ZAR)", "Свободно конвертируемая валюта, являющаяся национальной денежной единицей Южно-Африканской Республики и общей валютой стран Многостороннего валютного соглашения, куда помимо ЮАР входят Лесото, Намибия и Эсватини.",
                R.drawable.afrcur, ""));

    }
}