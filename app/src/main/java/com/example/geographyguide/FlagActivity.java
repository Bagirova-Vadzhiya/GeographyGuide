 package com.example.geographyguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class FlagActivity extends AppCompatActivity {

    private ImageButton arrow;

    List<Flags> flag = new ArrayList<Flags>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);

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
        flag.add(new Flags("Австралия", "Австралийский Союз — государство в Южном полушарии.  Австралия является шестым по площади государством в мире, занимая около 5 % поверхности суши Земли. Также является крупнейшим по территории государством, полностью расположенном в Южном полушарии.\n" +
                "Население: 27 879 285 чел. (2022 г.)\n" +
                "Столица: Канберра (с 1927 г.)\n" +
                "Язык: Английский\n" +
                "Крупнейшие города: Сидней, Мельбурн, Брисбен, Перт, Аделаида, Голд-Кост, Ньюкасл, Вуллонгонг",
                R.drawable.australia, "Площадь государятва: 7 692 024 км²"));
        flag.add(new Flags("Бразилия", "Располагается в Южном и частично Северном полушариях Земли. Бразилия занимает восточную и центральную часть Южной Америки. Наибольшая протяжённость с севера на юг 4320 км, " +
                "с востока на запад 4328 км. Граничит со всеми странами материка, кроме Эквадора и Чили.\n" +
                "Население: 214 047 375 чел. (2022 г.)\n" +
                "Столица: Бразилиа (с 1960 г.)\n" +
                "Язык: Португальский\n" +
                "Крупнейшие города: Рио-де-Жанейро, Сан-Паулу, Форталеза, Салвадор",
                R.drawable.brazil, "Площадь государства: 8 515 767 км²"));
        flag.add(new Flags("Канада", "Государство в Северной Америке, крупнейшее по площади на этом континенте и второе в мире. Омывается Атлантическим, Тихим и Северным Ледовитым океанами, имея самую длинную береговую линию в мире.\n" +
                "Население: 38 654 738 чел. (февраль 2022 г.)\n" +
                "Столица: Оттава (с 1867 г.)\n" +
                "Языки: Английский язык, французский язык\n" +
                "Крупнейшие города: Торонто, Ванкувер, Монреаль, Калгари, Эдмонтон",
                R.drawable.canada, "Площадь государства: 9 984 670 км²"));
        flag.add(new Flags("Россия", "Россия расположена полностью в Северном полушарии, бо́льшая часть территории России располагается в Восточном полушарии, лишь восточная часть Чукотского автономного округа располагается в Западном полушарии. Омывается водами Тихого и Северного Ледовитого океанов, а также Балтийским, Чёрным, Азовским морями Атлантического океана, обладая самой протяжённой береговой линией в мире.\n" +
                "Население: 146 748 590 чел. (2020 г.)\n" +
                "Столица: Москва (с 1918 г.)\n" +
                "Язык: Русский\n" +
                "Крупнейшие города: Москва, Санкт-Петербург, Новосибирск, Екатеринбург, Казань, Нижний Новгород.",
                R.drawable.russia, "Площадь государства: 17 207 090 км²"));
        flag.add(new Flags( "Южно-Африканская Республика", "Государство в южной части Африки. На севере граничит с Намибией, Ботсваной и Зимбабве, на северо-востоке — с Мозамбиком и Свазилендом. Внутри страны находится государство-анклав Лесото.\n" +
                "Население: 60 604 992 чел. (2022 г.)\n" +
                "Столица: Претория, Кейптаун, Блумфонтейн\n" +
                "Языки: Зулу, Африкаанс, Тсонга, Южный ндебеле, тсвана, Венда, Северный сото, Коса, Сесото, Английский язык\n" +
                "Крупнейшие города: Йоханнесбург, Дурбан",
                R.drawable.safrica, "Площадь государства: 1 219 912 км²"));

    }
}