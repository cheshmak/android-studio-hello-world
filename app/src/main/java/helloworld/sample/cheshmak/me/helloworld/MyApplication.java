package helloworld.sample.cheshmak.me.helloworld;

import android.app.Application;

import me.cheshmak.android.sdk.core.Cheshmak;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Cheshmak.with(this);
        Cheshmak.initTracker("fbf94WrewF+6AiqWEZi1KQ==");//don't forget to replace it with your own
    }
}
