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
public class MyCartFragment extends Fragment {


    private RecyclerView cartItemsRecyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        cartItemsRecyclerView = view.findViewById(R.id.cart_items_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cartItemsRecyclerView.setLayoutManager(layoutManager);

        List<CartItemModel> cartItemModelList = new ArrayList<>();
        cartItemModelList.add(new CartItemModel(0, R.mipmap.phone, "Pixel 2", 2, "Rs.49999/-", "Rs. 59999/-", 1, 0, 0));
        cartItemModelList.add(new CartItemModel(0, R.mipmap.phone, "Pixel 2", 0, "Rs.49999/-", "Rs. 59999/-", 1, 1, 0));
        cartItemModelList.add(new CartItemModel(0, R.mipmap.phone, "Pixel 2", 2, "Rs.49999/-", "Rs. 59999/-", 1, 2, 0));
        cartItemModelList.add(new CartItemModel(1, "Price 3 in items", "Rs. 169999/-", "Free", "Rs.169999/-", "Rs.5999/-"));


        CartAdapter cartAdapter = new CartAdapter(cartItemModelList);
        cartItemsRecyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();


        return view;
    }

}
