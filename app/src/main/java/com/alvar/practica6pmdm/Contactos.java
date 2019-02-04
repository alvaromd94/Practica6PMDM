package com.alvar.practica6pmdm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;

public class Contactos extends AppCompatActivity {
    ImageView imageView, imageView2, imageView3, imageView4, imageView5, imageView6;
    String correo, telefono, cadena;
    SharedPreferences prefs;
    @SuppressLint("ClickableViewAccessibility")
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

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correo="correo";
                telefono="telefono";
                return false;
            }
        });
        imageView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correo="correo2";
                telefono="telefono2";
                return false;
            }
        });
        imageView3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correo="correo3";
                telefono="telefono3";
                return false;
            }
        });
        imageView4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correo="correo4";
                telefono="telefono4";
                return false;
            }
        });
        imageView5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correo="correo5";
                telefono="telefono5";
                return false;
            }
        });
        imageView6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                correo="correo6";
                telefono="telefono6";
                return false;
            }
        });
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_contactos, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {

        prefs = getSharedPreferences("fichero_configuracion", Context.MODE_PRIVATE);
        switch (item.getItemId()) {
            case R.id.Llamar:
                cadena = prefs.getString(telefono, null);
                if(cadena==null)
                {
                    Toast.makeText(this, "No existe un teléfono asociado a este contacto",  Toast.LENGTH_LONG).show();
                }
                else {
                    if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:" + cadena));
                        startActivity(callIntent);
                    } else {
                        requestPermissions(new String[]{CALL_PHONE}, 1);
                    }
                }
                break;
            case R.id.Correo:
                cadena = prefs.getString(correo, null);
                if(cadena==null)
                {
                    Toast.makeText(this, "No existe un correo asociado a este contacto", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.setType("text/plain");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{cadena});
                    startActivity(emailIntent);
                }
                break;
        }
        return super.onContextItemSelected(item);
    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edicion, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent intent2 = new Intent(this, Edicion.class);
        startActivity(intent2);
        return false;
    }
}
