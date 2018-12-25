package com.example.srivathsan.materialdesignsample;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){

        }
        else{

        }
    }
    public void showStandaloneToolbar(View view){
        Intent intent = new Intent(this, StandaloneToolbar.class);
        startActivity(intent);
    }
    public void showActionBar(View view){
        Intent intent = new Intent(this, ActionBar.class);
        startActivity(intent);
    }
    public void showContextualMenu(View view){
        Intent intent = new Intent(this, ContextualMenu.class);
        startActivity(intent);
    }
}
