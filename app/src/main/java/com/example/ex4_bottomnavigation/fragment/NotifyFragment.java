package com.example.ex4_bottomnavigation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ex4_bottomnavigation.R;
import com.example.ex4_bottomnavigation.adapter.NotifyRcvAdapter;
import com.example.ex4_bottomnavigation.model.Notify;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NotifyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotifyFragment extends Fragment {
    private NotifyRcvAdapter adapter;
    private RecyclerView rcv;
    private ArrayList<Notify> mList = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NotifyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NotifyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NotifyFragment newInstance(String param1, String param2) {
        NotifyFragment fragment = new NotifyFragment();
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
        View v = inflater.inflate(R.layout.fragment_notify, container, false);
        rcv = v.findViewById(R.id.rcv);
        mList.add(new Notify("Đã like ảnh của bạn","Amee",R.drawable.amee,"1 Ngày"));
        mList.add(new Notify("Đã yêu thích ảnh của bạn","Bill Gates",R.drawable.billgate,"2 Ngày"));
        mList.add(new Notify("Đã bình luận ảnh của bạn","Binance",R.drawable.binance,"2 Ngày"));
        mList.add(new Notify("Đã chia sẻ ảnh của bạn","Remitano",R.drawable.remitano,"3 Ngày"));
        adapter = new NotifyRcvAdapter(getActivity(),mList);
        rcv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        rcv.setAdapter(adapter);
        return v;
    }
}