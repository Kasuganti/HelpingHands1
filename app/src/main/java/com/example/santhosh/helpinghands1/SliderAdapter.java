package com.example.santhosh.helpinghands1;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context)
    {
        this.context=context;
    }

    public int[] slide_images =
            {
                    R.drawable.adoption,
                    R.drawable.winstonchurchil,
                    R.drawable.famous
            };


    public  String[] slide_headings=

            {
                    "Helping Hands",
                    "Helping Hands",
                    "Helping Hands"
            };
    public String[] slide_descs={
            "Helping is serving God",
            "Helping is serving God",
            "Helping is serving God"
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view ==(RelativeLayout) o;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout, container,  false);

        ImageView slideImageView=(ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading=(TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription=(TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}