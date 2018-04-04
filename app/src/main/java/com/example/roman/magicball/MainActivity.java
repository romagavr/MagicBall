package com.example.roman.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String[] answers = new String[]{"Вперед!",
            "Не сейчас",
            "Не делай"+"\n"+"этого",
            "Ты шутишь?",
            "Да,"+"\n"+"но позднее",
            "Думаю,"+"\n"+"не стоит",
            "Не надейся"+"\n"+"на это",
            "Ни в коем"+"\n"+"случае",
            "Это неплохо",
            "Кто знает?",
            "Туманный ответ,"+"\n"+"попробуй еще",
            "Я не уверен",
            "Я думаю,"+"\n"+"хорошо",
            "Забудь"+"\n"+"об этом",
            "Это возможно",
            "Определенно -"+"\n"+"да",
            "Быть может",
            "Слишком"+"\n"+"рано",
            "Да",
            "Конечно, да",
            "Даже"+"\n"+"не думай",
            "Лучше Вам"+"\n"+"пока этого"+"\n"+"не знать"};
    final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(answers[random.nextInt(answers.length)]);
            }
        });
    }
}
