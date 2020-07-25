package com.nayanJai.nishuscookingncraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class User_Dashboard extends AppCompatActivity {


    ///////////////////////Banner Slider
    private ViewPager bannerSliderViewPager;
    private List<SliderModel> sliderModelList;

    ///////////////////////Banner Slider


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user__dashboard);

        //////////////////Banner slider
        bannerSliderViewPager = findViewById(R.id.banner_slider);

        sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.cake));
        sliderModelList.add(new SliderModel(R.drawable.baking));
        sliderModelList.add(new SliderModel(R.drawable.brownie));
        sliderModelList.add(new SliderModel(R.drawable.chocolate));
        sliderModelList.add(new SliderModel(R.drawable.cart));

        SliderAdapter sliderAdapter = new SliderAdapter(sliderModelList);
        bannerSliderViewPager.setAdapter(sliderAdapter);
        bannerSliderViewPager.setClipToPadding(false);
        bannerSliderViewPager.setPageMargin(20);

        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (state == ViewPager.SCROLL_STATE_IDLE);

            }
        };
        bannerSliderViewPager.addOnPageChangeListener(onPageChangeListener);
        //////////////////Banner slider


    }


}