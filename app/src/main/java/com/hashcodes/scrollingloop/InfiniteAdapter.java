package com.hashcodes.scrollingloop;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;



public class InfiniteAdapter extends PagerAdapter {
    private Context activity;
    private int[] image;
    private int pos = 0;

    public InfiniteAdapter(Context activity, int[] image){
        this.activity = activity;
        this.image = image;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }


    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        ImageView img = new ImageView(activity);
        view.addView(img);
        img.setImageResource(image[pos]);

        if(pos >= image.length - 1){
            pos =0;
        }
        else{
            pos++;
        }

        return img;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }


    @Override
    public void destroyItem(ViewGroup view, int position, Object object) {
        (view).removeView((View)object);
    }


}
