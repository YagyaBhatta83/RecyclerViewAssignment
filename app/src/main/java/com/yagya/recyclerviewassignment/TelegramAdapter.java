package com.yagya.recyclerviewassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TelegramAdapter extends RecyclerView.Adapter<TelegramAdapter.TelegramViewHolder>{
    Context mContext;
    List<Telegram>telegramList;

    // Constructor , to recieve data from the activity

    public TelegramAdapter(Context mContext, List<Telegram> telegramList){
        this.mContext = mContext;
        this.telegramList = telegramList;
    }
    @NonNull
    @Override
    public TelegramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_telegram,parent,false);
        return new TelegramViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TelegramViewHolder holder, int position) {
        Telegram telegram = telegramList.get(position);
        holder.imageView.setImageResource(telegram.getImageId());
        holder.tvName.setText(telegram.getName());
        holder.tvMessage.setText(telegram.getMessage());
        holder.tvTime.setText(telegram.getTime());

    }

    @Override
    public int getItemCount() {
        return telegramList.size();
    }

    public class TelegramViewHolder extends RecyclerView.ViewHolder{
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
