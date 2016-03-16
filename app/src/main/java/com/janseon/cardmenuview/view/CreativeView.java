package com.janseon.cardmenuview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.janseon.cardmenuview.app.R;
import com.janseon.cardmenuview.base.BaseCardLayout;

public class CreativeView extends BaseCardLayout {


    public CreativeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void findViews() {
        View.inflate(getContext(), R.layout.view_main_creative, this);

        TextView txt_title = new TextView(getContext());
        int pad = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15f, getResources().getDisplayMetrics());
        txt_title.setPadding(pad, pad, pad, pad);
        txt_title.setGravity(Gravity.CENTER_HORIZONTAL);
        txt_title.setText("前世");
        addView(txt_title, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        TextView textView = (TextView)findViewById(R.id.creative_view);
        textView.getBackground().setAlpha(100);
        //super.findViews();
    }

    private void setSize(View view) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = (int) (params.height * 1.4f);
        view.setLayoutParams(params);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void setViewsContent() {
//		DrawableUtil.setTextDrawableLeft(txt_title, -1, R.drawable.icon_creative);
//		txt_title.setText(R.string.creative);
    }

    @Override
    protected void setViewsListener() {
    }

}
