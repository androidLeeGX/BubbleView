package com.form_check.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.form_check.R;
import com.form_check.bubble.BubbleDrawer;
import com.form_check.bubble.FloatBubbleView;

/**
 * 关于详情页
 * Created by 15848 on 2017/12/22.
 */

public class About extends BaseActivity{
    private FloatBubbleView BubbleView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        initData();
        initView();
    }

    private void initData(){
        BubbleView = (FloatBubbleView) findViewById(R.id.about_bubbleView);
    }

    private void initView(){
        //设置气泡绘制者
        BubbleDrawer bubbleDrawer = new BubbleDrawer(this);
        //设置渐变背景 如果不需要渐变 设置相同颜色即可
        bubbleDrawer.setBackgroundGradient(new int[]{0xffffffff, 0xffffffff});//0xffffffff
        //给SurfaceView设置一个绘制者
        BubbleView.setDrawer(bubbleDrawer);
    }

    @Override
    protected void onResume() {
        super.onResume();
        BubbleView.onDrawResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        BubbleView.onDrawPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BubbleView.onDrawDestroy();
    }
}
