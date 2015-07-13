package com.stryker.endo.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.nuance.speechanywhere.Session;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        boolean handled = false;
        int id = item.getItemId();

        switch(id) {
            case R.id.action_other:
                handled = true;
                break;
            case R.id.action_exit:
                handled = true;
                break;
            default:
                handled = super.onOptionsItemSelected(item);
        }

        return handled;
    }

    // event handlers

    // menu events
    public void onClickMenuOther(MenuItem item){
        Toast toast = Toast.makeText(this, "Other clicked", Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickMenuExit(MenuItem item){
        finish();
    }

    // events
    public void onStartCaseButtonClicked(View view) {
    }

    public void onScheduledButtonClicked(View view) {
        Intent intent = new Intent(this, SchedulesActivity.class);
        startActivity(intent);
    }

    public void onHomeButtonClick(View view) {
    }

    public void onMessagingButtonClick(View view) {
        Intent intent = new Intent(this, MessagingActivity.class);
        startActivity(intent);
    }

    public void onPreferenceCardClick(View view) {
    }
}
