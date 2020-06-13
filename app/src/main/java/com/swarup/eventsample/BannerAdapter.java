package com.swarup.eventsample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class BannerAdapter extends PagerAdapter {

    private List<BannerModel> bannerModelList;

    public BannerAdapter(List<BannerModel> bannerModelList) {
        this.bannerModelList = bannerModelList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.banner_layout, container,false);
        ImageView banner = view.findViewById(R.id.banner1);
        banner.setImageResource(bannerModelList.get(position).getBanner());
        container.addView(view,0);
        return view ;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return bannerModelList.size();
    }
}
