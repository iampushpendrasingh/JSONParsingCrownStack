package com.iampushpendra.jsonwork;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.iampushpendra.jsonwork.adapter.CustomListAdapter;
import com.iampushpendra.jsonwork.app.AppController;
import com.iampushpendra.jsonwork.model.Songs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Log tag
    private static final String TAG = MainActivity.class.getSimpleName();

    // Movies json url
    private static final String url = "https://itunes.apple.com/search?term=Michael+jackson";
    private ProgressDialog pDialog;
    private List<Songs> songsList = new ArrayList<Songs>();
    private ListView listView;
    private CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listViewItems);

        pDialog = new ProgressDialog(this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading...");
        pDialog.show();

        requestGetSongs();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(MainActivity.this, "" + songsList.get(i).getTrackName() + " " + songsList.get(i).getTrackPrice(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SingleViewActivity.class);
                String trackPrice = songsList.get(i).getCurrency() + " " + songsList.get(i).getTrackPrice();
                // intent.putExtra("trackPrice", songsList.get(i).getTrackPrice());
                intent.putExtra("trackPrice", trackPrice);

                intent.putExtra("currency", songsList.get(i).getCurrency());
                intent.putExtra("releaseDate", songsList.get(i).getReleaseDate());
                intent.putExtra("country", songsList.get(i).getCountry());
                intent.putExtra("trackName", songsList.get(i).getTrackName());
                intent.putExtra("artistName", songsList.get(i).getArtistName());
                intent.putExtra("primaryGenreName", songsList.get(i).getPrimaryGenreName());
                intent.putExtra("artworkUrl30", songsList.get(i).getArtworkUrl30());
                intent.putExtra("artworkUrl100", songsList.get(i).getArtworkUrl100());

                startActivity(intent);

            }
        });
    }

    public void requestGetSongs() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d(TAG, response.toString());
                hidePDialog();

                // parsing JSON
                try {
                    JSONArray jsonArray = response.getJSONArray("results");
                    for (int l = 0; l < jsonArray.length(); l++) {
                        JSONObject curr = jsonArray.getJSONObject(l);
                        Songs songs = new Songs();
                        int trackId = curr.getInt("trackId");
                        String trackName = curr.getString("trackName");
                        int trackPrice = curr.getInt("trackPrice");
                        String releaseDate = curr.getString("releaseDate");
                        String country = curr.getString("country");
                        String artworkUrl30 = curr.getString("artworkUrl30");
                        String artworkUrl100 = curr.getString("artworkUrl100");
                        String currency = curr.getString("currency");
                        String artistName = curr.getString("artistName");
                        String primaryGenreName = curr.getString("primaryGenreName");


                        songs.setReleaseDate(releaseDate);
                        songs.setTrackPrice(trackPrice);
                        songs.setCountry(country);
                        songs.setTrackName(trackName);
                        songs.setArtworkUrl30(artworkUrl30);
                        songs.setCurrency(currency);
                        songs.setArtistName(artistName);
                        songs.setPrimaryGenreName(primaryGenreName);
                        songs.setArtworkUrl100(artworkUrl100);

                        songsList.add(songs);
                        Log.v(TAG, trackId + "-->" + trackName);
                        adapter = new CustomListAdapter(MainActivity.this, songsList);
                        listView.setAdapter(adapter);
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                hidePDialog();
            }

        });
        //Adding request to queue
        AppController.getInstance().addToRequestQueue(jsonObjectRequest, "jsonreq");


    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }
}
