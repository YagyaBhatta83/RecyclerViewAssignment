package com.yagya.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        // Create a list of telegram to display in RecyclerView

        List<Telegram> telegramList = new ArrayList<>();
        telegramList.add(new Telegram("Allu Arjun" , "Its me Allu Arjun", "10:10",R.drawable.alluarjun));
        telegramList.add(new Telegram("Hulk", "Its me Hulk", "11:00",R.drawable.hulk));
        telegramList.add(new Telegram("Ironman","Its me Ironman", "4:40",R.drawable.ironman));
        telegramList.add(new Telegram("Spider Man", "Its me Spider Man", "5:20",R.drawable.spiderman));

        TelegramAdapter telegramAdapter = new TelegramAdapter(this, telegramList);
        recyclerView.setAdapter(telegramAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
