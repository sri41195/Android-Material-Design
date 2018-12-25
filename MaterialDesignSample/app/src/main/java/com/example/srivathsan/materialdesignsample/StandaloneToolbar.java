package com.example.srivathsan.materialdesignsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by srivathsan on 12/24/2018.
 */

public class StandaloneToolbar extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Standalone toolbar");
        toolbar.setSubtitle("online");
//        toolbar.setNavigationIcon(R.drawable.navigation_back);
//
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
//            toolbar.setElevation(30f);
//        }
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(StandaloneToolbar.this,item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
