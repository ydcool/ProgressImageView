package me.ydcool.progressimageview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSeekBar;
import android.view.View;
import android.widget.SeekBar;

import me.ydcool.lib.progressimageview.ProgressImageView;

public class MainActivity extends AppCompatActivity {

    private boolean mHasChanged;

    private ProgressImageView mProgressImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressImageView = (ProgressImageView) findViewById(R.id.Main_piv);

        ((AppCompatSeekBar) findViewById(R.id.Main_seekBar)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mProgressImageView.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        mProgressImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeAppearance();
            }
        });
    }

    private void changeAppearance() {
        if (mHasChanged) {
            mProgressImageView.setRadius(getResources().getDimensionPixelSize(R.dimen.demo_radius));
            mProgressImageView.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.demo_stroke));
            mProgressImageView.setMaskColor(ContextCompat.getColor(this, R.color.demo_mask_color));
        } else {
            mProgressImageView.setRadius(100);
            mProgressImageView.setStrokeWidth(8);
            mProgressImageView.setMaskColor(Color.argb(233, 44, 81, 162));
        }

        mHasChanged = !mHasChanged;
    }
}
