package com.example.android.myappportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchPopularMovie(View view) {
        Intent intent = getPackageManager()
                .getLaunchIntentForPackage("com.example.android.popularmovies");
        startActivity(intent);
    }

    public void launchSuperDuo(View view) {
        displayToast("This button will launch " + ((Button) findViewById(R.id.superDuo)).getText().toString() + "!");
    }

    public void launchBuildItBigger(View view) {
        displayToast("This button will launch " + ((Button) findViewById(R.id.buildItBigger)).getText().toString() + "!");
    }

    public void launchXYZReader(View view) {
        displayToast("This button will launch " + ((Button) findViewById(R.id.xyzReader)).getText().toString() + "!");
    }

    public void launchCapstone(View view) {
        displayToast("This button will launch " + ((Button) findViewById(R.id.capstone)).getText().toString() + "!");
    }

    public void launchMealPlanner(View view) {
        Intent intent = getPackageManager()
                .getLaunchIntentForPackage("com.example.android.mealplanner");
        if (intent != null)
            startActivity(intent);
        else
            displayToast("App " + ((Button) findViewById(R.id.mealplanner)).getText().toString() +
                    " is not installed on your device");
    }

    public void launchOpenbeelab(View view) {
        Intent intent = getPackageManager()
                .getLaunchIntentForPackage("com.example.android.openbeelab");
        Log.e("My", "intent" + intent);
        if (intent != null)
            startActivity(intent);
        else
            displayToast("App " + ((Button) findViewById(R.id.openbeelab)).getText().toString() +
                    " is not installed on your device");
    }

    private void displayToast(String msg) {
        //Stop any previous toasts
        if (mAppToast != null) {
            mAppToast.cancel();
        }
        //Make and display new toast
        mAppToast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        mAppToast.show();
    }
}
