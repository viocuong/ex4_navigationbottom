package com.example.ex4_bottomnavigation.adapter;

import android.app.Activity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ex4_bottomnavigation.R;
import com.example.ex4_bottomnavigation.model.Notify;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class NotifyRcvAdapter extends RecyclerView.Adapter<NotifyRcvAdapter.NotifyHolder> {
    private ArrayList<Notify> mList;
    private Activity activity;
    public NotifyRcvAdapter(Activity activity, ArrayList<Notify> list){
        this.activity = activity;
        this.mList = list;
    }
    @NonNull
    @Override
    public NotifyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new NotifyHolder(activity.getLayoutInflater().inflate(R.layout.layout_item_rcv_noti,parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull NotifyHolder holder, int position) {
        Notify notify = mList.get(position);
        holder.img.setImageResource(notify.getRsImg());
        String content = "<b>"+notify.getName()+"</b> "+notify.getContent();
        holder.content.setText(Html.fromHtml(content));
        holder.time.setText(notify.getDate());
        holder.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popop = new PopupMenu(activity,v);
                popop.getMenuInflater().inflate(R.menu.menu_option_noti,popop.getMenu());
                popop.show();
                popop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch(item.getItemId()){
                            case R.id.idelete:
                                mList.remove(position);
                                notifyDataSetChanged();
                                break;
                            case R.id.save:
                                Toast.makeText(activity,"Đã lưu",Toast.LENGTH_LONG).show();
                                break;
                        }
                        return true;
                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class NotifyHolder extends RecyclerView.ViewHolder{
        private CircleImageView img;
        private ImageView menu;
        private TextView content,time;
        public NotifyHolder(@NonNull View v) {
            super(v);
            menu = v.findViewById(R.id.menu);
            img = v.findViewById(R.id.img);
            content = v.findViewById(R.id.content);
            time = v.findViewById(R.id.time);

        }
    }
}
