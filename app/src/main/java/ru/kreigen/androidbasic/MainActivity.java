package ru.kreigen.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.VideoView;
//import android.os.Bundle;
//import android.util.Log;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.Toast;
//import com.google.android.youtube.player.YouTubeBaseActivity;
//import com.google.android.youtube.player.YouTubeInitializationResult;
//import com.google.android.youtube.player.YouTubePlayer;
//import com.google.android.youtube.player.YouTubePlayerView;
//import com.google.api.client.http.HttpRequest;
//import com.google.api.client.http.HttpRequestInitializer;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.services.youtube.YouTube;
//import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playRickVideo(View view) {
        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        String vidAddress = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        Uri vidUri = Uri.parse(vidAddress);
        videoView.setVideoURI(vidUri);
    }

    public void setTxt2(View view) {

    }

    public void setColorBackground(View view) {
    }

    public void settings(View view) {
        switch (view.getId()) {
            case R.id.settings:
                // TODO Call second activity
                break;
            default:
                break;
        }
    }
}