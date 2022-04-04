package dev.patika.spring.solid.isp.bad;

import javax.swing.text.View;

public class TextBox implements OnClickListener {
    @Override
    public void onClick(View vi) {
        System.out.println("Clicked");
    }

    @Override
    public void onLongClick(View view) {
        //The text box has no long click behaviour.
    }

    @Override
    public void onShortClick(View view) {
        System.out.println("On short clicked");
    }
}
