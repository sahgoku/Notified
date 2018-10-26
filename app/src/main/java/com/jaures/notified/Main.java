package com.jaures.notified;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class Main extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AppCompat);
        setContentView(R.layout.lc);

    }
}
