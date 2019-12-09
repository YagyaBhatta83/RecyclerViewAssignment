package com.yagya.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView circImg;
    TextView tvFullName, tvMessages, tvTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg = findViewById(R.id.circImg);
        tvFullName = findViewById(R.id.tvFullName);
        tvMessages = findViewById(R.id.tvMessages);
        tvTimes = findViewById(R.id.tvTimes);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            circImg.setImageResource(bundle.getInt("image"));
            tvFullName.setText(bundle.getString("name"));
            tvMessages.setText(bundle.getString("messages"));
            tvTimes.setText(bundle.getString("times"));
        }
    }
}
