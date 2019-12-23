package com.yagya.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView imageView;
    TextView tvName, tvMessage, tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.imageView);
        tvName = findViewById(R.id.tvName);
        tvMessage = findViewById(R.id.tvMessage);
        tvTime = findViewById(R.id.tvTime);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            imageView.setImageResource(bundle.getInt("imageView"));
            tvName.setText(bundle.getString("tvName"));
            tvMessage.setText(bundle.getString("tvMessage"));
            tvTime.setText(bundle.getString("tvTime"));
        }
    }
}
