package com.horgan.gerard.usi2;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter(Context context){
        this.context=context;
    }

    public int[] slide_images = {

            R.drawable.man111,
            R.drawable.coffee,
            R.drawable.happy,
    };

    public  String[]  slide_headings = {

            "Conversation",
            "Where",
            "Review"
    };

    public String[]  slide_descrpt = {

            "How to approach a conversation" ,
            "Where to have the conversation....",
            "How did the conversation go and what to do next...."


    };






    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return  view == (RelativeLayout) object;
    }



    public  Object instantiateItem (ViewGroup container , int position)
    {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.sliderlayout, container ,   false);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_descrpt);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descrpt[position]);

        container.addView(view);
        return view;
    }

    public  void destroyItem(ViewGroup container, int position , Object o ){

        container.removeView((RelativeLayout)o);


    }





}