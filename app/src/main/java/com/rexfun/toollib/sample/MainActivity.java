package com.rexfun.toollib.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.rexfun.androidlibrarytool.InjectUtil;
import com.rexfun.androidlibrarytool.bmputil.BitmapLoader;


public class MainActivity extends AppCompatActivity {
    @InjectUtil.InjectView(id= R.id.iv_web_image)
    ImageView ivWebImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtil.injectView(this);

        String url = "http://192.168.19.123:8181/paper/client/paperimage/getPaperImageByPidAndMaxSort.action?pid=7";
        BitmapLoader.loadBitmaps(this, null, ivWebImage, url, null, null);
    }
}
