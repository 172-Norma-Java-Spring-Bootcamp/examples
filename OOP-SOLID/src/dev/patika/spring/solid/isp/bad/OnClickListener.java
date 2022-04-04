package dev.patika.spring.solid.isp.bad;

import javax.swing.text.View;

public interface OnClickListener {

    void onClick(View vi);

    void onLongClick(View view);

    void onShortClick(View view);
}
