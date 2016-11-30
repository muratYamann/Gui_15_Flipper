package com.yamankod.gui_15_flipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {
    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flipper = (ViewFlipper) findViewById(R.id.details);

        Button btn = (Button) findViewById(R.id.flip_me);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                flipper.showNext();
            }
        });
    }
}
