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
public class HomeFragment extends Fragment {

    private RecyclerView testing;
    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    ///////////////// Banner Slider

    //////////////// Strip Ad



    //////////////// Horizontal Product Layout

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        categoryRecyclerView = view.findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);

        final List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link", "Home"));
        categoryModelList.add(new CategoryModel("link", "Electronics"));
        categoryModelList.add(new CategoryModel("link", "Appliances"));
        categoryModelList.add(new CategoryModel("link", "Furniture"));
        categoryModelList.add(new CategoryModel("link", "Toys"));
        categoryModelList.add(new CategoryModel("link", "Sports"));
        categoryModelList.add(new CategoryModel("link", "Wall Arts"));
        categoryModelList.add(new CategoryModel("link", "Books"));
        categoryModelList.add(new CategoryModel("link", "Shoes"));

        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        ///////////////// Banner Slider


        final List<SliderModel> sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.icon_home, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.custom_error_icon, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.btn_email, "#077AE4"));

        sliderModelList.add(new SliderModel(R.mipmap.btn_email, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.my_mall, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.ic_launcher, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.shoping_card, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.profile_placeholder, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.icon_home, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.mercedes, "#077AE4"));

        sliderModelList.add(new SliderModel(R.mipmap.custom_error_icon, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.btn_email, "#077AE4"));
        sliderModelList.add(new SliderModel(R.mipmap.btn_email, "#077AE4"));



        ///////////////// Banner Slider



        ///////////////// Horizontal Product Layout


        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));



        ///////////////// Horizontal Product Layout



        /////////////////////////////////////
        testing = view.findViewById(R.id.home_page_recyclerview);
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0, sliderModelList));
        homePageModelList.add(new HomePageModel(1, R.mipmap.mercedes, "#000000"));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ic_launcher_background, "#ffff00"));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.mipmap.mercedes, "#ff0000"));
        homePageModelList.add(new HomePageModel(0, sliderModelList));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        /////////////////////////////////////


        return view;
    }




}
