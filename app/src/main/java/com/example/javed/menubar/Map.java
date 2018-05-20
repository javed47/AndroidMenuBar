package com.example.javed.menubar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Map extends Activity {
    public Intent goToActivityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_page_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        boolean itemHasSelected = false;

        switch (item.getItemId()) {
            case R.id.menu_settings: {
                goToActivityIntent = new
                        Intent(this, Settings.class);
                itemHasSelected = true;
                break;
            }
            case R.id.menu_home: {
                goToActivityIntent = new Intent(this, MainActivity.class);
                itemHasSelected = true;
                break;
            }
//            case R.id.menu_map: {
//                goToActivityIntent = new
//                        Intent(this, Map.class);
//                itemHasSelected = true;
//                break;
//            }
            case R.id.menu_contact_us: {
                goToActivityIntent = new
                        Intent(this, ContactUs.class);
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
