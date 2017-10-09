package com.iampushpendra.jsonwork;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.iampushpendra.jsonwork.app.AppController;
import com.iampushpendra.jsonwork.model.Songs;


public class SingleViewActivity extends AppCompatActivity {

    TextView textViewtrackPrice;
    TextView textViewreleaseDate;
    TextView textViewcountry;
    TextView textViewcurrency;
    TextView textViewtrackName;
    TextView textViewartistName;
    TextView textViewprimaryGenreName;
    ImageView imageViewartworkUrl30;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);

        Intent i = getIntent();
        String trackPrice = i.getStringExtra("trackPrice");
        String releaseDate = i.getStringExtra("releaseDate");
        String country = i.getStringExtra("country");
        //String currency = i.getStringExtra("currency");
        String trackName = i.getStringExtra("trackName");
        String artistName = i.getStringExtra("artistName");
        String primaryGenreName = i.getStringExtra("primaryGenreName");
        //String artworkUrl30 = i.getStringExtra("artworkUrl30");
        String artworkUrl100 = i.getStringExtra("artworkUrl100");


        textViewtrackPrice = (TextView) findViewById(R.id.trackPrice);
        textViewreleaseDate = (TextView) findViewById(R.id.releaseDate);
        textViewcountry = (TextView) findViewById(R.id.country);
        //textViewcurrency = (TextView) findViewById(R.id.currency);
        textViewtrackName = (TextView) findViewById(R.id.trackName);
        textViewartistName = (TextView) findViewById(R.id.artistName);
        textViewprimaryGenreName = (TextView) findViewById(R.id.primaryGenreName);
        imageViewartworkUrl30 = (ImageView) findViewById(R.id.artworkUrl30);

        textViewartistName.setText(artistName);
        textViewtrackName.setText(trackName);
        textViewtrackPrice.setText(trackPrice);
        textViewreleaseDate.setText(releaseDate);
        // textViewcurrency.setText(currency);
        textViewprimaryGenreName.setText(primaryGenreName);
        textViewcountry.setText(country);
        imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView networkImageView = (NetworkImageView) findViewById(R.id.artworkUrl30);
        networkImageView.setImageUrl(artworkUrl100, imageLoader);

        //Toast.makeText(SingleViewActivity.this, "" + country, Toast.LENGTH_SHORT).show();

    }


}
