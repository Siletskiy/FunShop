package com.example.fun;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyOrdersFragment extends Fragment {


    private RecyclerView myOrdersRecyclerView;

    public MyOrdersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_orders, container, false);

        myOrdersRecyclerView = view.findViewById(R.id.my_orders_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myOrdersRecyclerView.setLayoutManager(layoutManager);

        List<MyOrderItemModel> myOrderItemModelList = new ArrayList<>();
        myOrderItemModelList.add(new MyOrderItemModel(R.mipmap.phone, 2, "Pixel 2XL (BLACK)", "Delivered on Mon, 15th JAN 2013"));
        myOrderItemModelList.add(new MyOrderItemModel(R.mipmap.phone, 1, "Pixel 2XL (BLACK)", "Delivered on Mon, 15th JAN 2013"));
        myOrderItemModelList.add(new MyOrderItemModel(R.mipmap.phone, 0, "Pixel 2XL (BLACK)", "Canceled"));
        myOrderItemModelList.add(new MyOrderItemModel(R.mipmap.phone, 4, "Pixel 2XL (BLACK)", "Delivered on Mon, 15th JAN 2013"));

        MyOrderAdapter myOrderAdapter = new MyOrderAdapter(myOrderItemModelList);
        myOrdersRecyclerView.setAdapter(myOrderAdapter);
        myOrderAdapter.notifyDataSetChanged();

        return view;
    }

}
