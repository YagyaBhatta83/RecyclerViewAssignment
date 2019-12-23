package com.yagya.recyclerviewassignment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TelegramAdapter extends RecyclerView.Adapter<TelegramAdapter.TelegramViewHolder> {
    Context mContext;
    List<Telegram> telegramList;

    // Constructor , to recieve data from the activity

    public TelegramAdapter(Context mContext, List<Telegram> telegramList) {
        this.mContext = mContext;
        this.telegramList = telegramList;
    }

    @NonNull
    @Override
    public TelegramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_telegram, parent, false);
        return new TelegramViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TelegramViewHolder telegramViewHolder, int i) {
        final Telegram telegram = telegramList.get(i);
        telegramViewHolder.imageView.setImageResource(telegram.getImageId());
        telegramViewHolder.tvName.setText(telegram.getName());
        telegramViewHolder.tvMessage.setText(telegram.getMessage());
        telegramViewHolder.tvTime.setText(telegram.getTime());

        //Adding click listener in an imageview

        telegramViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("imageView", telegram.getImageId());
                intent.putExtra("tvName", telegram.getName());
                intent.putExtra("tvMessage", telegram.getMessage());
                intent.putExtra("tvTime", telegram.getTime());

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return telegramList.size();
    }

    public class TelegramViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imageView;
        TextView tvName, tvMessage, tvTime;

        public TelegramViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tvName);
            tvMessage = itemView.findViewById(R.id.tvMessage);
            tvTime = itemView.findViewById(R.id.tvTime);

        }
    }
}
