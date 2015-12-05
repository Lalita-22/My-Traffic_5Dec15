package rtc.phoampai.lalita.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //button Controller
        buttonController();

    }  // Main Method

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.cow);
                buttonMediaPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);

                objIntent.setData(Uri.parse("https://youtu.be/TH0n8YGgvGg"));
                startActivity(objIntent);
            }   // event
        });
    }

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }

}   // Main Class นี่คือคลาสหลัก
