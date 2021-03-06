package id.fathonyfath.quranreader.views.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

public class OverlayView extends View {

    public OverlayView(Context context) {
        super(context);

        initOverlayColor();
    }

    @SuppressWarnings("deprecation")
    private void initOverlayColor() {
        GradientDrawable drawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{
                Color.BLACK,
                Color.TRANSPARENT
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }
}
