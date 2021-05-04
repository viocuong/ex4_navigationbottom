package com.example.ex4_bottomnavigation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ex4_bottomnavigation.R;
import com.example.ex4_bottomnavigation.adapter.MessagerRcvAdapter;
import com.example.ex4_bottomnavigation.model.Message;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MessageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MessageFragment extends Fragment {
    private RecyclerView rcv;
    private ArrayList<Message> mList = new ArrayList<>();
    private MessagerRcvAdapter adapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MessageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MessageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MessageFragment newInstance(String param1, String param2) {
        MessageFragment fragment = new MessageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_message, container, false);
        rcv = v.findViewById(R.id.rcv);
        mList.add(new Message(10,20,"Cuong Nguyen",R.drawable.cuong,new String[] {"Xin chào bạn, mình là Cường"}));
        mList.add(new Message(00,12,"Amee",R.drawable.amee,new String[] {"Ngủ ngon nhé!"}));
        mList.add(new Message(6,22,"Remitano",R.drawable.remitano,new String[] {"Khoản đầu tư xrp của bạn đã lời 33%"}));
        mList.add(new Message(10,20,"Binance",R.drawable.binance,new String[] {"Welcom to Binance!"}));
        mList.add(new Message(11,00,"Bill Gates",R.drawable.billgate,new String[] {"Gửi số tài khoản mai nhân 100 tỷ nhé :)"}));
        mList.add(new Message(10,20,"Cuong Nguyen",R.drawable.cuong,new String[] {"Xin chào bạn, mình là Cường"}));
        mList.add(new Message(10,20,"Cuong Nguyen",R.drawable.cuong,new String[] {"Xin chào bạn, mình là Cường"}));
        mList.add(new Message(10,20,"Cuong Nguyen",R.drawable.cuong,new String[] {"Xin chào bạn, mình là Cường"}));
        mList.add(new Message(10,20,"Cuong Nguyen",R.drawable.cuong,new String[] {"Xin chào bạn, mình là Cường"}));


        adapter = new MessagerRcvAdapter(getActivity(),mList);
        rcv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        rcv.setAdapter(adapter);
        return v;
    }
}