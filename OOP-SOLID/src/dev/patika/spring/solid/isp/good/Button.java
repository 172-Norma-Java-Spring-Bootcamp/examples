package dev.patika.spring.solid.isp.good;

import javax.swing.text.View;

public class Button implements OnClickListener, OnLongClickListener {
    @Override
    public void onClick(View view) {
        System.out.println("Clicked");
    }

    @Override
    public void onLongClick(View view) {
        System.out.println("Long Clicked");
    }
}
