package dev.patika.spring.solid.isp.good;

import javax.swing.text.View;

public class Text implements OnClickListener, OnShortClickListener {
    @Override
    public void onClick(View view) {
        System.out.println("Clicked");
    }

    @Override
    public void onShortClick(View view) {

    }
}
