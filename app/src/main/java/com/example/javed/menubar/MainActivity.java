package com.example.javed.menubar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
/**
 * This app is for implementing menu bar into an app activity
 * for creating menu first create a resource folder for menu
 * in menu xml create items which can be selected
 * then in the activity add two methods onCreateOptionsMenu and onOpetionsItemSelected
 * Wire up the menu resource in onCreateOptionsMenu method
 **/
public class MainActivity extends Activity {
    public Intent goToActivityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method will create the menu and display it
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_page_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //this method will wrap up the actions related on selection of the menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        boolean itemHasSelected = false;

        switch (item.getItemId()) {
            case R.id.menu_settings: {
                goToActivityIntent = new
                        Intent(MainActivity.this, Settings.class);
                itemHasSelected = true;
                break;
            }
            //this is the main home page so no need of refreshing the homepage unnecessarily
//            case R.id.menu_home: {
//                goToActivityIntent = new Intent(this, MainActivity.class);
//                itemHasSelected = true;
//                break;
//            }
            case R.id.menu_map: {
                goToActivityIntent = new
                        Intent(MainActivity.this, Map.class);
                itemHasSelected = true;
                break;
            }
            case R.id.menu_contact_us: {
                goToActivityIntent = new
                        Intent(MainActivity.this, ContactUs.class);
                itemHasSelected = true;
                break;
            }
            default: {
                return super.onOptionsItemSelected(item);
            }
        }
        startActivity(goToActivityIntent);
        return itemHasSelected;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
