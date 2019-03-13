package hu.szrnkapeter.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneTimeWorkRequest configCheckerWorkRequest = new OneTimeWorkRequest.Builder(
                JSONLoaderWorker.class)
                .build();
        WorkManager.getInstance().enqueue(configCheckerWorkRequest);
    }
}
