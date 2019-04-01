package com.example.fun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {


    private RecyclerView categoryRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String title = getIntent().getStringExtra("CategoryName");

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        categoryRecyclerView = findViewById(R.id.category_recyclerview);


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

        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(this);
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0, sliderModelList));
        homePageModelList.add(new HomePageModel(1, R.mipmap.mercedes, "#000000"));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.ic_launcher_background, "#ffff00"));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.mipmap.mercedes, "#ff0000"));


        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.main_search_icon) {
            //todo: search
            return true;
            // Handle the camera action
        } else if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
