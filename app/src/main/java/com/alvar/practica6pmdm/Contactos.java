package com.alvar.practica6pmdm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;

public class Contactos extends AppCompatActivity {
    ImageView imageView, imageView2, imageView3, imageView4, imageView5, imageView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);

         imageView = findViewById(R.id.imageView);
         imageView2 = findViewById(R.id.imageView2);
         imageView3 = findViewById(R.id.imageView3);
         imageView4 = findViewById(R.id.imageView4);
         imageView5 = findViewById(R.id.imageView5);
         imageView6 = findViewById(R.id.imageView6);

        registerForContextMenu(imageView);
        registerForContextMenu(imageView2);
        registerForContextMenu(imageView3);
        registerForContextMenu(imageView4);
        registerForContextMenu(imageView5);
        registerForContextMenu(imageView6);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_contactos, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Llamar:
                Toast.makeText(this, "UNO", Toast.LENGTH_SHORT).show();break;
            case R.id.Correo:
                Toast.makeText(this, "DOS", Toast.LENGTH_SHORT).show();break;
        }
        return true;
    }
}
