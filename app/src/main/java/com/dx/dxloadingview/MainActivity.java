package com.dx.dxloadingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DxLoadingView loadingView = (DxLoadingView) findViewById(R.id.loading_view);
        loadingView.startAnimation();
        loadingView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                loadingView.cancelAnimation();
            }
        });
    }
}
