package com.hashcodes.scrollingloop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    public int[] image = {R.drawable.b,R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.a};
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.viewpager);
        pager.setOffscreenPageLimit(1);
        pager.setAdapter(new InfiniteAdapter(this,image));



//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                Log.i("Pager", String.valueOf(pager.getCurrentItem() + 1));
//                pager.setCurrentItem(pager.getCurrentItem() + 1);
//                handler.postDelayed(this,5000);
//
//            }
//        },5000);

    }
}
