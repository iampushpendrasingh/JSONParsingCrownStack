package com.iampushpendra.jsonwork.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.iampushpendra.jsonwork.R;

import com.iampushpendra.jsonwork.app.AppController;
import com.iampushpendra.jsonwork.model.Songs;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    private static final String TAG = CustomListAdapter.class.getSimpleName();
    private Activity activity;
    private LayoutInflater inflater;
    private List<Songs> songsItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Songs> movieItems) {
        this.activity = activity;
        this.songsItems = movieItems;
    }

    @Override
    public int getCount() {
        return songsItems.size();
    }

    @Override
    public Object getItem(int location) {
        return songsItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.layout_list_row, null);

        if (imageLoader == null)
            imageLoader = AppController.getInstance().getImageLoader();
        NetworkImageView thumbNail = (NetworkImageView) convertView.findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.trackNameTitle);


        // getting songs data for the row
        Songs eachrow = songsItems.get(position);

        // thumbnail image
        thumbNail.setImageUrl(eachrow.getArtworkUrl100(), imageLoader);
        Log.v(TAG, "***" + eachrow.getTrackName());
        // title
        title.setText(eachrow.getTrackName());


        return convertView;
    }

}