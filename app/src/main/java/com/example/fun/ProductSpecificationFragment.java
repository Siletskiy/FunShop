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
public class ProductSpecificationFragment extends Fragment {


    private RecyclerView productSpecificationRecyclerView;


    public ProductSpecificationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_specification, container, false);

        productSpecificationRecyclerView = view.findViewById(R.id.product_specification_recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);


        productSpecificationRecyclerView.setLayoutManager(linearLayoutManager);

        List<ProdactSpecificationMode> prodactSpecificationModeList = new ArrayList<>();
        prodactSpecificationModeList.add(new ProdactSpecificationMode(0, "General"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(0, "General"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(0, "Display"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(0, "General"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(0, "General"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(0, "Display"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));
        prodactSpecificationModeList.add(new ProdactSpecificationMode(1, "RAW", "4GB"));

        ProductSpecificationAdapter productSpecificationAdapter = new ProductSpecificationAdapter(prodactSpecificationModeList);
        productSpecificationRecyclerView.setAdapter(productSpecificationAdapter);

        productSpecificationAdapter.notifyDataSetChanged();

        return view;

    }

}
