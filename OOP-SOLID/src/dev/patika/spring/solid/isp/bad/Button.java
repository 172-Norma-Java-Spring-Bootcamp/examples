package dev.patika.spring.solid.isp.bad;

import javax.swing.text.View;

public class Button implements OnClickListener {
    @Override
    public void onClick(View vi) {
        System.out.println("Clicked");
    }

    @Override
    public void onLongClick(View view) {
        System.out.println("On Long Clicked");
    }

    @Override
    public void onShortClick(View view) {
        // no -op
    }
}
