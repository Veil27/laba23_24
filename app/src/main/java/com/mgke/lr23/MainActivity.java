package com.mgke.lr23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем ссылки на элементы
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView largeTextView = findViewById(R.id.largeTextView);

        // Обработчик нажатия для первой кнопки
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие для первой кнопки, например, показать сообщение
                Toast.makeText(MainActivity.this, "Нажата первая кнопка", Toast.LENGTH_SHORT).show();
                // Выводим текст в largeTextView
                largeTextView.setText("Первая кнопка нажата");
            }
        });

        // Обработчик нажатия для второй кнопки
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие для второй кнопки, например, показать сообщение
                Toast.makeText(MainActivity.this, "Нажата вторая кнопка", Toast.LENGTH_SHORT).show();
                // Выводим текст в largeTextView
                largeTextView.setText("Вторая кнопка нажата");
            }
        });
    }
}
