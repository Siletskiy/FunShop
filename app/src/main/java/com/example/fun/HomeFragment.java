package com.example.fun;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    final private long DELAY_TIME = 3000;
    final private long PERIOD_TIME = 3000;
    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    ///////////////// Banner Slider
    private ViewPager bannerSliderViewPager;
    private List<SliderModel> sliderModelList;
    private int currentPage = 2;
    private Timer timer;
    //////////////// Strip Ad
    private ImageView stripAdImage;


    //////////////// Banner Slider
    private ConstraintLayout stripAdContainer;
    //////////////// Horizontal Product Layout
    private TextView horizontalLayoutTitle;
    //////////////// Strip Ad
    private Button horizontalLayoutViewAllBtn;
    private RecyclerView horizontalRecyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }

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

        List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
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

        bannerSliderViewPager = view.findViewById(R.id.baner_slider_view_pager);

        sliderModelList = new ArrayList<SliderModel>();

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


        SliderAdapter sliderAdapter = new SliderAdapter(sliderModelList);
        bannerSliderViewPager.setAdapter(sliderAdapter);
        bannerSliderViewPager.setClipToPadding(false);
        bannerSliderViewPager.setPageMargin(20);

        bannerSliderViewPager.setCurrentItem(currentPage);

        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                currentPage = i;


            }

            @Override
            public void onPageScrollStateChanged(int i) {
                if (i == ViewPager.SCROLL_STATE_IDLE) {
                    pagerLooper();
                }

            }
        };
        bannerSliderViewPager.addOnPageChangeListener(onPageChangeListener);

        startBannerSlideShow();

        bannerSliderViewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                pagerLooper();
                stopBannerSlideShow();
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    startBannerSlideShow();
                }

                return false;
            }
        });

        ///////////////// Banner Slider

        ///////////////// Strip Ad
        stripAdImage = view.findViewById(R.id.strip_ad_image);
        stripAdContainer = view.findViewById(R.id.strip_ad_container);

        stripAdImage.setImageResource(R.mipmap.b1);
        stripAdContainer.setBackgroundColor(Color.parseColor("#000000"));

        ///////////////// Strip Ad

        ///////////////// Horizontal Product Layout
        horizontalLayoutTitle = view.findViewById(R.id.horizontal_scroll_layout_title);
        horizontalLayoutViewAllBtn = view.findViewById(R.id.horizontal_scroll_view_all_btn);
        horizontalRecyclerView = view.findViewById(R.id.horizontal_scroll_layout_recyclerView);

        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.phone, "Redmi 5A", "SD 625 Processor", "Rs.5999"));

        HorizontalProductScrollAdapter horizontalProductScrollAdapter = new HorizontalProductScrollAdapter(horizontalProductScrollModelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        horizontalRecyclerView.setLayoutManager(linearLayoutManager);

        horizontalRecyclerView.setAdapter(horizontalProductScrollAdapter);
        horizontalProductScrollAdapter.notifyDataSetChanged();

        ///////////////// Horizontal Product Layout


        return view;
    }

    ///////////////// Banner Slider

    private void pagerLooper() {
        if (currentPage == sliderModelList.size() - 2) {
            currentPage = 2;
            bannerSliderViewPager.setCurrentItem(currentPage, false);
        }
        if (currentPage == 1) {
            currentPage = sliderModelList.size() - 3;
            bannerSliderViewPager.setCurrentItem(currentPage, false);
        }
    }

    private void startBannerSlideShow() {
        final Handler handler = new Handler();
        final Runnable updata = new Runnable() {
            @Override
            public void run() {
                if (currentPage >= sliderModelList.size()) {
                    currentPage = 1;
                }
                bannerSliderViewPager.setCurrentItem(currentPage++, true);

            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(updata);
            }
        }, DELAY_TIME, PERIOD_TIME);
    }

    private void stopBannerSlideShow() {
        timer.cancel();
    }
    ///////////////// Banner Slider

}
