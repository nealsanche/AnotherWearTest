package org.nsdev.weartest;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;

/**
 * Created by nealsanche on 15-03-24.
 */
public class InnerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inner_activity);

        WatchViewStub stub = (WatchViewStub) findViewById(R.id.stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub watchViewStub) {

            }
        });

    }
}
