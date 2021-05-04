package com.example.ex4_bottomnavigation.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ex4_bottomnavigation.R;
import com.example.ex4_bottomnavigation.model.Message;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessagerRcvAdapter extends RecyclerView.Adapter<MessagerRcvAdapter.MessageHolder> {
    private ArrayList<Message> mList;
    private Activity activity;
    public MessagerRcvAdapter(Activity activity,ArrayList<Message> list){
        this.mList = list;
        this.activity = activity;

    }

    @NonNull
    @Override
    public MessageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = activity.getLayoutInflater().inflate(R.layout.layout_item_rcv,parent,false);
        return new MessageHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageHolder holder, int position) {
        Message m = mList.get(position);
        holder.img.setImageResource(m.getRsImg());
        holder.name.setText(m.getName());
        holder.content.setText(m.getMessageContent()[m.getMessageContent().length-1]);
        holder.time.setText(""+ m.getHour()+":"+m.getMinute());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MessageHolder extends RecyclerView.ViewHolder {
        private CircleImageView img;
        private TextView name,content,time;
        public MessageHolder(@NonNull View v) {
            super(v);
            img = v.findViewById(R.id.img);
            name = v.findViewById(R.id.name);
            content = v.findViewById(R.id.content);
            time = v.findViewById(R.id.time);

        }
    }
}
