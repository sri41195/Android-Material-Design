package com.example.srivathsan.materialdesignsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by srivathsan on 12/24/2018.
 */

public class ActionBar  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Action bar toolbar");
        toolbar.setSubtitle("online");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.save:
                Toast.makeText(ActionBar.this,getString(R.string.save),Toast.LENGTH_SHORT).show();
                break;

            case R.id.settings:
                Toast.makeText(ActionBar.this,getString(R.string.settings),Toast.LENGTH_SHORT).show();
                break;

            case R.id.email:
                Toast.makeText(ActionBar.this,getString(R.string.email),Toast.LENGTH_SHORT).show();
                break;

            case R.id.camera:
                Toast.makeText(ActionBar.this,getString(R.string.camera),Toast.LENGTH_SHORT).show();
                break;

            case R.id.web_search:
                Toast.makeText(ActionBar.this,getString(R.string.search),Toast.LENGTH_SHORT).show();
                break;

            case R.id.help:
                Toast.makeText(ActionBar.this,getString(R.string.help),Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
