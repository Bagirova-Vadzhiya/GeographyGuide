package com.example.geographyguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class AttractionsActivity extends AppCompatActivity {

    private ImageButton arrow;

    List<Flags> flag = new ArrayList<Flags>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

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
        flag.add(new Flags("Сиднейский оперный театр", "Музыкальный театр в Сиднее, одно из самых узнаваемых зданий во всем мире, а также главный символ достопримечательность Австралии." +
                " Театр был открыт 20 октября 1973 года королевой Австралии Елизаветой II, а с 28 июня 2007 года внесён ЮНЕСКО в список объектов Всемирного наследия. Сиднейский оперный театр находится в сиднейской гавани на мысе Беннелонг.",
                R.drawable.theater, ""));
        flag.add(new Flags("Статуя Христа-Искупителя", "Знаменитая статуя, что находится на горе Корковадо в городе Рио-де-Жанейро. Она считается символом города и всей страны. Монумент соорудили из железобетонного материала и мыльного камня. " +
                " Высота статуи равняется 38 метрам, вес - 1145 тонн, а размах рук - 30 метров. Каждый год к подножию статуи Христа Искупителя приходят больше, чем полтора миллиона приезжих туристов. К вершине постамента проведена железная дорога.",
                R.drawable.statue, ""));
        flag.add(new Flags("Си-Эн Тауэр", "553,3-метровая телевизионная башня, расположенная в Торонто. Была самым высоким свободно стоящим сооружением в мире с 1976 по 2007 год, а также до сих пор остаётся таковым в Западном полушарии. Является символом Торонто.",
                R.drawable.tower, ""));
        flag.add(new Flags("Московский Кремль", "Это самая крупная действующая крепость Европы. Его полурежимный статус объясняется тем, что весь комплекс одновременно и памятник, включенный в Список Всемирного культурного наследия ЮНЕСКО," +
                " и официальная резиденция Президента Российской Федерации. Кремль представляет собой 20 башен, стены высотой от 5 до 19 м, толщиной от 3 до 7 м и общей протяженностью - 2,5 км, музеи, соборы, сады и другие достопримечательности. ",
                R.drawable.kremlin, ""));
        flag.add(new Flags( "Водопад Ауграбис", "Находится на реке Оранжевая на территории ЮАР, совсем недалеко от границы с Намибией. Сама река течёт могучим потоком по землям Южной Африки в сторону Атлантического океана." +
                " Она ширится, разливается, а в нескольких километрах от водопада оказывается в скалистом нагорье. В этом месте её ширина достигает 7 км.",
                R.drawable.waterfall, ""));

    }

}