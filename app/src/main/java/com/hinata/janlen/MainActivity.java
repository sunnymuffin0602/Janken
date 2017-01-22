package com.hinata.janlen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final int GU = 0;
    private static final int CHOKI = 1;
    private static final int PA = 2;

    ImageView enemyImageView;
    ImageView playerImageView;
    TextView resultImageView;
    Random enemyRandom = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enemyImageView = (ImageView) findViewById(R.id.enemy);
        playerImageView = (ImageView) findViewById(R.id.player);
        resultImageView = (TextView) findViewById(R.id.result);
    }

    public void gu(View v) {
        int enemy = enemyRandom.nextInt(3);
        playerImageView.setImageResource(R.drawable.gu);
        


        //ジャッジ書き足す


    }

    public void choki(View v) {
        int enemy = enemyRandom.nextInt(3);
        playerImageView.setImageResource(R.drawable.choki);


    }

    public void pa(View v) {
        playerImageView.setImageResource(R.drawable.pa);
        int enemy = enemyRandom.nextInt(3);

    }
}
