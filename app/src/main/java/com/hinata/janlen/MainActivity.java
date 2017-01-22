package com.hinata.janlen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView enemyImageView;
    ImageView playerImageView;
    TextView resultImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enemyImageView = (ImageView) findViewById(R.id.enemy);
        playerImageView = (ImageView) findViewById(R.id.player);
        resultImageView = (TextView) findViewById(R.id.result);

    }

    public void gu(View v) {
        //ランダム敵表示入れる　チョキパーも同じく
        playerImageView.setImageResource(R.drawable.gu);


        //ジャッジ書き足す


    }

    public void choki(View v) {
        playerImageView.setImageResource(R.drawable.choki);



    }

    public void pa(View v) {
        playerImageView.setImageResource(R.drawable.pa);

    }
}
