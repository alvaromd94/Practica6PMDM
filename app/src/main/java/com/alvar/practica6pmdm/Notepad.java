package com.alvar.practica6pmdm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class Notepad extends AppCompatActivity {


        EditText txtBloc;
        SharedPreferences prefs;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_notepad);
            prefs = getSharedPreferences("fichero_configuracion", Context.MODE_PRIVATE);
            txtBloc = findViewById(R.id.editText);
            txtBloc.setText(prefs.getString("Notepad", ""));

        }
        @SuppressLint("RestrictedApi")
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bloc, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;
    }
        @SuppressLint("NewApi")
        @Override
        public boolean onOptionsItemSelected(MenuItem item)
        {
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("Notepad", txtBloc.getText().toString());
            editor.commit();
            return false;
        }
    }
